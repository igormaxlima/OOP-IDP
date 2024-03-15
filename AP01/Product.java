public class Product { 
    public String name;
    public double price;
    public String description;
    
    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    public double calculateICMS() { 
        ICMS icms = new ICMS();
        return icms.calculateTax(this.price);
    }
    
    public double calculateIPI() { 
        IPI ipi = new IPI();
        return ipi.calculateTax(this.price);
    }
    
}
