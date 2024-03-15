public class Main
{
	public static void main(String[] args) {
		Product product1 = new Product("Maçã", 57.3, "da Branca de Neve");
        
		System.out.println("Preço do Produto: " + product1.price);
		System.out.println("Taxa do ICMS: 17%");
		System.out.println("Taxa do IPI: 25%");
		System.out.println("Valor Final do Produto com ICMS: " + product1.calculateICMS());
		System.out.println("Valor Final do Produto com IPI: " + product1.calculateIPI());
		
		System.out.println("====================================");
		
		Service service1 = new Service("Curso de POO", 147.0, "te ensinar do basico ao avançado");
        
		System.out.println("Preço do Serviço: " + service1.price);
		System.out.println("Taxa do ISS: 4,6%");
		System.out.println("Taxa do ICMS: 17%");
		System.out.println("Valor Final do Serviço com ISS: " + service1.calculateISS());
		System.out.println("Valor Final do Serviço com ICMS: " + service1.calculateICMS());
	}
}
