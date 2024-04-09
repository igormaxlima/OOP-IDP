public class Caminhonete extends Veiculo { 
    
    public Caminhonete(String tipo, double peso) { 
        super(tipo, peso);
    }
    
    @Override
    public double precoPorPeso() { 
        if(this.getPeso() > 6000) { 
            return 0;
        } else if(this.getPeso() <= 3000) { 
            return 25.00;
        } else {
            return 50.00;
        }
    }
    
}