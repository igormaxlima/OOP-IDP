public class Motocicleta extends Veiculo { 

    public Motocicleta(String tipo, double peso) { 
        super(tipo, peso);
    }

    @Override
    public double precoPorPeso() { 
        if(this.getPeso() <= 100) { 
            return 2.00;
        } else if(this.getPeso() >= 300) { 
            return 10.00;
        } else { 
            return 4.00;
        }
    }
}