public class appConta {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Fernando", "fernando@mail.com", 1231);
    Conta c = new Conta(1, p);

    c.movimentar(100, 1);
    c.movimentar(50, 0);

    System.out.println(c.saldo);

    c.movimentar(25, 0);

    System.out.println(c.saldo);
  }
}
