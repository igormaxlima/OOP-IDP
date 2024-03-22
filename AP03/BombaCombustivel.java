public class BombaCombustivel { 
    private String tipoCombustivel;
    private double valorLitro;
    private int quantidadeCombustivel;
      
    public BombaCombustivel(String tipoCombustivel, double valorLitro, int quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
      
    public int abastecerPorValor(double valor) { 
        int litrosAbastecidos = (int) (valor / this.valorLitro);
        this.quantidadeCombustivel -= litrosAbastecidos;
        return litrosAbastecidos;
    }
 
    public double abastecerPorLitro(int litros) {
      if(litros > this.quantidadeCombustivel) { 
          System.out.println("Não é possivel fazer esse abastecimento, não temos essa quantidade de litos disponiveis");
          return 0;
      }
      this.quantidadeCombustivel -= litros;
      return valorLitro * (double) litros;
    }
    
    public void alterarValor(double novoValor) { 
        this.valorLitro = novoValor;
    } 
    
    public void alterarCombustivel(String tipoDoCombustivel) { 
      this.tipoCombustivel = tipoDoCombustivel;
    } 
    
    public void alterarQuantidadeCombustivel(int litros) {
        quantidadeCombustivel -= litros;
    } 
    
    public int getQuantidadeCombustivel() {
        return this.quantidadeCombustivel;
    }

    public double getValorLitro() {
        return this.valorLitro;
    }
    
    public String getTipoCombustivel() { 
        return this.tipoCombustivel;
    }   
}