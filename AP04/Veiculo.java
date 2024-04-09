public abstract class Veiculo { 

    private String tipo;
    private double peso;
    
    public Veiculo(String tipo, double peso) { 
        this.tipo = tipo;
        this.peso = peso;
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) { 
        this.tipo = tipo;
    }

    public double getPeso() { 
        return this.peso;
    }

    public void setPeso(double peso) { 
        this.peso = peso;
    }

    public abstract double precoPorPeso();
}