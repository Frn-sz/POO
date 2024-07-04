public class AppConta {
  public static void main(String[] args) {
    Conta conta1 = new Conta();
    Conta conta2 = new Conta(2, "Fernando", 200.20f);
    
    conta1.id = 1;
    conta1.owner_name = "Jorge";
    conta1.balance = 300.0f;

    conta1.print_data();
    conta2.print_data();
  }
}
