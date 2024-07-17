public class appImobiliaria {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Fernando", "fernando@mail.com", 123);

    ImovelAluguel ia = new ImovelAluguel(p, 100, "Apartamento", 100, 200);
    ImovelVenda iv = new ImovelVenda(p, 120, "Apartamento", 200, 100, 10);

    System.out.println("Valor IPTU Aluguel: " + ia.calcularIPTU(0.05f));
    System.out.println("Valor IPTU Venda: " + iv.calcularIPTU(0.05f));

    System.out.println("Financiamento: " + Financeiro.calcularFinanciamento(iv.getValorVenda(), 10, 1.10f));
    System.out.println("A vista: " + Financeiro.calcularDesconto(iv.getValorVenda(), 0.25f));

    System.out.println("ITBI Aluguel: " + iv.calcularITBI(10));
    System.out.println("Valor do aluguel: " + ia.getValorAluguel());

    System.out.println("Acréscimo: " + Financeiro.calcularAcrescimo(ia.getValorAluguel(), 10));
  }
}
