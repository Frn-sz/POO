public class Conta {
  int id;
  String owner;
  float balance;

  public Conta() {
  }

  public Conta(int id, String owner, float money) {
    this.id = id;
    this.owner = owner;
    this.balance = money;
  }

  public Conta(int id, String owner) {
    this.id = id;
    this.owner = owner;
    this.balance = 0.00f;
  }

  public float get_balance() {
    return this.balance;
  }

  public void deposit(float qnt) {
    this.balance += qnt;
  }

  public boolean withdraw(float qnt) {
    if (this.balance - qnt >= 0) {
      this.balance -= qnt;
      return true;
    }
    return false;
  }

  public void print_conta() {
    System.out.println("Código: " + this.id + "\nCorrentista: " + this.owner + "\nSaldo: " + this.balance);
  }

}