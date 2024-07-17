import java.util.Scanner;

public class appExemplo2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();

    System.out.println("Informe seu nome: ");
    pessoa.nome = keyboard.nextLine();
    System.out.println("Informe seu email: ");
    pessoa.email = keyboard.nextLine();
    System.out.println("Informe seu celular");
    pessoa.celular = keyboard.nextLong();

    System.out.println("Nome: " + pessoa.nome + "\nEmail: " + pessoa.email + "\nCelular: " + pessoa.celular);
  }
}
