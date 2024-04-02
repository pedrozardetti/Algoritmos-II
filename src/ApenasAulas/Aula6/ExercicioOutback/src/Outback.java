public class Outback {
    
  public int mesa;
  public int pessoas;
  public double total;

  public void pedir(String desc, double valor) {
      System.out.printf("Produto registrado: %s - R$ %.2f", desc, valor);
      this.total += valor;
  }

    public NotaFiscal fechar(boolean pagarTaxa) {
      NotaFiscal nf = new NotaFiscal;
      nf.total = total;

      if (pagarTaxa) nf.taxaServico = nf.total * 0.05;

      nf.totalFinal = nf.total + nf.taxaServico;
      nf.valorPorPessoa = nf.totalFinal / this.pessoas;
      return nf;
  }
  

}
