
public class appConta {

  public static void main(String[] args) {
    Pessoa p = new Pessoa("Fernando", 3131, "fernando@mail.com");

    ContaCorrente cc = new ContaCorrente(1, 100, p);
    ContaEspecial ce = new ContaEspecial(2, 200, p, 100);

    System.out.println("Saldo pós saque de 100 (Conta corrente): " + cc.sacar(100));

    System.out.println("Saldo pós saque de 250 (Conta especial): " + ce.sacar(250));
  }

}
