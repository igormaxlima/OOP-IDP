import java.util.Scanner;

public class Estacionamento { 
    
    public static void estacionarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        CalculaPreco calculadora = new CalculaPreco();
        double precoFinal = 0;
        
        System.out.println("Gostaria de saber qual o tipo do seu veículo: ");
        System.out.println("1. Motocicleta");
        System.out.println("2. Carro hatchback");
    	  System.out.println("3. Carro sedan");
        System.out.println("4. Carro SUV");
        System.out.println("5. Caminhonete");
        System.out.println("6. Furgão");
        System.out.print(": ");
        int tipo = scanner.nextInt();
        
        System.out.println("Qual o peso do veículo?");
        System.out.print(": ");
        double peso = scanner.nextDouble();
        System.out.println("Quantas horas você ficou?");
        System.out.print(": ");
        int horas = scanner.nextInt();
        
        switch(tipo) { 
            case 1: 
                Motocicleta motocicleta = new Motocicleta("Motocicleta", peso);
                precoFinal = calculadora.calculaPrecoFinal(horas, motocicleta.precoPorPeso());
                break;
            case 2:
                CarroHatchback hatchback = new CarroHatchback("Carro Hatchback", peso);
                precoFinal = calculadora.calculaPrecoFinal(horas, hatchback.precoPorPeso());
                break;
            case 3:
                CarroSedan sedan = new CarroSedan("Carro Sedan", peso);
                precoFinal = calculadora.calculaPrecoFinal(horas, sedan.precoPorPeso());
                break;
            case 4:
                CarroSUV suv = new CarroSUV("Carro SUV", peso);
                precoFinal = calculadora.calculaPrecoFinal(horas, suv.precoPorPeso());
                break;
            case 5:
                Caminhonete caminhonete = new Caminhonete("Caminhonete", peso);
                precoFinal = calculadora.calculaPrecoFinal(horas, caminhonete.precoPorPeso());
                break;
            case 6:
                Furgao furgao = new Furgao("Furgão", peso);
                precoFinal = calculadora.calculaPrecoFinal(horas, furgao.precoPorPeso());
                break;
            default: 
                System.out.println("Opção inválida. Tente novamente.");
        }
        
        
        System.out.println("O valor final à ser pago é: " + precoFinal);
        System.out.println(" ");
    }

}