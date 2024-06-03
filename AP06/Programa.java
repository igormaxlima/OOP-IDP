package br.edu.idp.tech.poo;

import br.edu.idp.tech.poo.dao.CarroDao;
import br.edu.idp.tech.poo.dao.CarroJdbcDao;
import br.edu.idp.tech.poo.dao.CarroJpaDao;
import br.edu.idp.tech.poo.entidade.Carro;
import br.edu.idp.tech.poo.ui.CliIavel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    private String sufixo;
    private CliIavel ui;

    public Programa(CliIavel cli) {
        this.ui = cli;
    }

    public void executar() {
        // passo 1 - criando a "marca" da execução

        // marca criada para diferenciar o que é cadastrado em cada execução
        sufixo = " /" + gerarLetraAletoria();
        ui.exibirInformacao("Sufixo da execução: " + sufixo);

        // passo 2 - criação do banco de dados

        // criação da tabela
        prepararBD();

        // passo 3 e 4 - várias operações com JDBC e JPA, chamando uma unica funcao generica "executarDao"
        ui.exibirInformacao("execução via JDBC - início");
        executarDao(new CarroJdbcDao(), 3);
        ui.exibirInformacao("execução via JDBC - término");

        ui.exibirInformacao("execução via JPA - início");
        executarDao(new CarroJpaDao(), 4);
        ui.exibirInformacao("execução via JPA - término");

    }

    // uma unica funcao generica para tratar tanto execucao via JBDC quanto JPA quanto qlqr outra desde que implemente a interface CarroDao
    private void executarDao(CarroDao dao, int quantidadeCarros) {
        criarRegistros(dao, quantidadeCarros);

        List<Carro> carros = dao.findAll();
        ui.exibirListaCarros(carros);
    }

    // uma unica funcao generica para tratar criacao de registros evitando repeticao de codigo para JBDC e JPA
    private void criarRegistros(CarroDao dao, int quantidadeCarros) {
        // gerador aleatório de carros para "economizar" a inclusão de dados pelo usuário
        CarregadorDados carregador = new CarregadorDados(sufixo);

        Carro novoCarro = carregador.gerarCarro();
        // salvar carro criado
        dao.salvar(novoCarro);

        List<Carro> novosCarros = new ArrayList<>();
        novosCarros.addAll(carregador.gerarListaCarros(quantidadeCarros));
        // salvar coleção de carros
        dao.salvar(novosCarros);
    }

    private void prepararBD() {
        try {
            CarroJdbcDao.criarTabela();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private char gerarLetraAletoria() {
        final int NUM_LETRA_BASE = 97;
        final int QUANTIDADE_LETRAS = 25;

        int numero = GeradorNumAletorio.gerarInt(QUANTIDADE_LETRAS);

        return (char) (NUM_LETRA_BASE + numero);
    }
}
