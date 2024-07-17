import java.util.Scanner;

public class appScanner {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String name = keyboard.nextLine();
    System.out.println("\n Seu nome é " + name);
    
  }
}