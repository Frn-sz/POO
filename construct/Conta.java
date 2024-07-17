public class Conta {
  int id;
  String owner_name;
  float balance;

  // Construtor Padrão
  public Conta() {
  }

  // Sobrecarga
  public Conta(int id, String owner_name, float balance) {
    this.id = id;
    this.owner_name = owner_name;
    this.balance = balance;
  }

  public void print_data() {
    System.err.println("Id: " + this.id + "\nCorrentista: " + this.owner_name + "\nSaldo:" + this.balance);
  }
}