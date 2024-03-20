public class BombaCombustivel { 
    public String tipoCombustivel = "";
    public double valorLitro = 0;
    public int quantidadeCombustivel = 500;
      
      
    public int abastecerPorValor(double valor) { 
        return (int) (valor / this.valorLitro);
    }
  
    public double abastecerPorLitro(int litros) { 
      alterarQuantidadeCombustivel(litros);  
      return valorLitro * (double) litros;
    }
    
    public void alterarValor() { 
        if (this.tipoCombustivel.equals("Etanol")) { 
            this.valorLitro = 3.651;
        } else if (this.tipoCombustivel.equals("Aditivada")) { 
            this.valorLitro = 5.90;
        } else if (this.tipoCombustivel.equals("Comum")) { 
            this.valorLitro = 5.75;
        } else { 
            this.valorLitro = 4.20;
        }
    } 
    
    public void alterarCombustivel(String tipoDoCombustivel) { 
      this.tipoCombustivel = tipoDoCombustivel;
    } 
    
    public void alterarQuantidadeCombustivel(int litros) { 
      this.quantidadeCombustivel -= litros;
    } 
}