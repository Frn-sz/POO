public class appConta {

  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Fernando", "fernando@mail.com", 231231);

    Conta c1 = new Conta(1, p1);
    Conta c2 = new Conta(2, p1);
    Conta c3 = new Conta(3, p1);
    Conta c4 = new Conta(3, p1);

    System.out.println(Conta.getNumeroContas());
  }

}
