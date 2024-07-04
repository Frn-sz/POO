public class appConta {

  public static void main(String[] args) {
    Conta conta = new Conta(1, "Fernando");
    Conta conta2 = new Conta(2, "Jorge", 1000);
    Conta conta3 = new Conta();

    conta3.id = 3;
    conta.owner = "Pedro";

    conta.print_conta();

    conta2.print_conta();

    conta3.print_conta();

    conta.deposit(500f);

    conta2.deposit(300f);

    conta3.deposit(450f);

    System.out.println("\n\n");

    conta.print_conta();

    conta2.print_conta();

    conta3.print_conta();

    if (conta.withdraw(250)) {
      System.out.println("Saque realizado com sucesso");
      conta.print_conta();
    } else {
      System.out.println("Saldo insuficiente");
    }

    if (conta2.withdraw(500)) {
      System.out.println("Saque realizado com sucesso");
      conta2.print_conta();
    } else {
      System.out.println("Saldo insuficiente");
    }

    if (conta3.withdraw(1500)) {
      System.out.println("Saque realizado com sucesso");
      conta3.print_conta();
    } else {
      System.out.println("Saldo insuficiente");
    }
  }
}