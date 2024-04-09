public class CarroSedan extends Veiculo { 
    
    public CarroSedan(String tipo, double peso) { 
        super(tipo, peso);
    }
    
    @Override
    public double precoPorPeso() { 
        if(this.getPeso() > 2000) { 
            return 0;
        } else { 
            return 15.00;
        }
    }

}