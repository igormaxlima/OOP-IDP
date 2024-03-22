import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		BombaCombustivel gasolinaComum = new BombaCombustivel("Gasolina Comum", 5.75, 1000);
    BombaCombustivel gasolinaAditivada = new BombaCombustivel("Gasolina Aditivada", 6.00, 1500);
    BombaCombustivel alcool = new BombaCombustivel("Álcool", 4.20, 800);
    BombaCombustivel diesel = new BombaCombustivel("Diesel", 4.80, 1200);
		
		BombaCombustivel[] bombas = { gasolinaComum, gasolinaAditivada, alcool, diesel };
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá, tudo bom?");
		System.out.println("Qual tipo de combustivel deseja utilizar?:");
		System.out.println("Escolha o tipo de combustível:");
    for (int i = 0; i < bombas.length; i++) {
      System.out.println((i + 1) + " - " + bombas[i].getTipoCombustivel());
    }
    System.out.print(": ");
    int escolhaCombustivel = scanner.nextInt();
		
		System.out.println("Valor do " +  bombas[escolhaCombustivel - 1].getTipoCombustivel() + ": " + bombas[escolhaCombustivel - 1].getValorLitro());
		System.out.println("Quantidade disponivel de litros de " + bombas[escolhaCombustivel - 1].getTipoCombustivel() + ": " + bombas[escolhaCombustivel - 1].getQuantidadeCombustivel());
		
		System.out.println("Qual a forma deseja abastecer?:");
		System.out.println("1 -> por Valor");
		System.out.println("2 -> por Litro");
		System.out.print(": ");
		int escolha = scanner.nextInt();
		
		if(escolha == 1) { 
    		System.out.println("Qual o valor do abastecimento?:");
    		System.out.print(": ");
    		double valor = scanner.nextDouble();
    		int litrosAbastecidos = bombas[escolhaCombustivel - 1].abastecerPorValor(valor);
    		System.out.println("Foi abestecido " + litrosAbastecidos + " litros de " + bombas[escolhaCombustivel - 1].getTipoCombustivel() + " com esse valor!");
		} else { 
		    System.out.println("Quantos litros deseja abastecer?:");
    		System.out.print(": ");
    		int litros = scanner.nextInt();
    		double valorFinal = bombas[escolhaCombustivel - 1].abastecerPorLitro(litros);
    		System.out.println("Ficou " + valorFinal + " reais o abastecimento no total!");
		}

		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println("Valor e Quantidade total de combustível na bomba:");
    System.out.println("Gasolina Comum - " + gasolinaComum.getValorLitro() + ": " + gasolinaComum.getQuantidadeCombustivel() + " litros");
    System.out.println("Gasolina Aditivada - " + gasolinaAditivada.getValorLitro() + ": " + gasolinaAditivada.getQuantidadeCombustivel() + " litros");
    System.out.println("Álcool - " + alcool.getValorLitro() + ": " + alcool.getQuantidadeCombustivel() + " litros");
    System.out.println("Diesel - " + diesel.getValorLitro() + ": " + diesel.getQuantidadeCombustivel() + " litros");
		System.out.println("Obrigado e tenha um ótimo dia!");
	}
}