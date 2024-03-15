public class Service { 
    public String name;
    public double price;
    public String description;
    
    public Service(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    public double calculateISS() { 
        ISS iss = new ISS();
        return iss.calculateTax(this.price);
    } 
    
    public double calculateICMS() { 
        ICMS icms = new ICMS();
        return icms.calculateTax(this.price);
    }
    
}