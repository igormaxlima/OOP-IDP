public class CarroHatchback extends Veiculo { 
    
    public CarroHatchback(String tipo, double peso) { 
        super(tipo, peso);
    }
    
    @Override
    public double precoPorPeso() { 
        if(this.getPeso() > 2000) { 
            return 0;
        } else { 
            return 13.00;
        }
    }

}