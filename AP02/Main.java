import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		BombaCombustivel bomba = new BombaCombustivel();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá, tudo bom?");
		System.out.println("Qual tipo de combustivel deseja utilizar?:");
		String tipoCombustivel = scanner.nextLine();
		bomba.alterarCombustivel(tipoCombustivel);
		bomba.alterarValor();
		System.out.println("Valor do " + bomba.tipoCombustivel + ": " + bomba.valorLitro);
		
		System.out.println("Qual a forma deseja abastecer?:");
		System.out.println("1 -> por Valor");
		System.out.println("2 -> por Litro");
		System.out.print(": ");
		int escolha = scanner.nextInt();
		
		if(escolha == 1) { 
    		System.out.println("Qual o valor do abastecimento?:");
    		System.out.print(": ");
    		double valor = scanner.nextDouble();
    		int litrosAbastecidos = bomba.abastecerPorValor(valor);
    		System.out.println("Foi abestecido " + litrosAbastecidos + " litros de " + bomba.tipoCombustivel + " com esse valor!");
		} else { 
		    System.out.println("Quantos litros deseja abastecer?:");
    		System.out.print(": ");
    		int litros = scanner.nextInt();
    		double valorFinal = bomba.abastecerPorLitro(litros);
    		System.out.println("Ficou " + valorFinal + " reais o abastecimento no total!");
		}
		System.out.println("Restam apenas " + bomba.quantidadeCombustivel + " litros na bomba apos seu abastecimento.");
		System.out.println("Obrigado e tenha um ótimo dia!");
	}
}
