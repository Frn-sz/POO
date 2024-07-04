/**
 * ImovelVenda
 */
public class ImovelVenda extends Imovel {
  private float valorVenda;
  private float valorDesconto;
  private float prazoFinanciamento;

  public ImovelVenda() {
  }

  public ImovelVenda(Pessoa proprietario, float area, String tipo, float valorVenda, float valorDesconto,
      float prazoFinanciamento) {
    super(proprietario, area, tipo);
    this.valorVenda = valorVenda;
    this.valorDesconto = valorDesconto;
    this.prazoFinanciamento = prazoFinanciamento;
  }

  public float getValorVenda() {
    return valorVenda;
  }

  public float getValorDesconto() {
    return valorDesconto;
  }

  public float getPrazoFinanciamento() {
    return prazoFinanciamento;
  }

  public void setValorDesconto(float valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  public void setValorVenda(float valorVenda) {
    this.valorVenda = valorVenda;
  }

  public void setPrazoFinanciamento(float prazoFinanciamento) {
    this.prazoFinanciamento = prazoFinanciamento;
  }

  @Override
  public float calcularIPTU(float fator) {
    return fator * (this.getArea() + this.getValorVenda() * 0.05f);
  }

  public float calcularVenda() {
    return this.valorVenda - this.valorDesconto;
  }

  public float calcularITBI(float taxa) {
    return this.valorVenda * (taxa / 100);
  }

}