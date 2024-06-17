import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {

    private Venda venda;
    private Item item;

    @BeforeEach
    public void setup() {
        venda = new Venda("Cliente Teste");
        item = new Item("Produto Teste", 2, 100.0);
    }

    @Test
    public void testInicializacaoVenda() {
        assertEquals("Cliente Teste", venda.getCliente());
        assertEquals(Venda.SITUACAO_NAO_INICIADA, venda.getSituacao());
        assertEquals(0.0, venda.getValor());
    }

    @Test
    public void testAdicionarItem() {
        venda.vender("Produto Teste", 100.0, 2);
        assertEquals(1, venda.getValor());
        assertEquals(200.0, venda.getValor());
    }

    @Test
    public void testAplicarDescontoEmVendaNaoIniciada() {
        assertFalse(venda.aplicarDesconto(10.0));
    }

    @Test
    public void testAplicarDescontoComSucesso() {
        venda.vender("Produto Teste", 100.0, 2);
        assertTrue(venda.aplicarDesconto(10.0));
        assertEquals(180.0, venda.getValor());
    }

    @Test
    public void testFinalizarVenda() {
        venda.vender("Produto Teste", 100.0, 2);
        venda.finalizar();
        assertEquals(Venda.SITUACAO_ENCERRADA, venda.getSituacao());
    }

    @Test
    public void testAdicionarItemEmVendaEncerrada() {
        venda.vender("Produto Teste", 100.0, 2);
        venda.finalizar();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            venda.vender("Outro Produto", 50.0, 1);
        });
        assertEquals("venda encerrada", exception.getMessage());
    }

    @Test
    public void testAplicarDescontoAcimaDoLimite() {
        venda.vender("Produto Teste", 100.0, 2);
        assertFalse(venda.aplicarDesconto(80.0));
    }
}