import java.util.Scanner;

public class appAssalariado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = s.nextLine();
        System.out.println("Digite o CPF");
        long cpf = s.nextLong();
        System.out.println("Digite o salário");
        double salario = s.nextDouble();
        System.out.println("Digite a comissão:");
        double comissao = s.nextDouble();

        Assalariado a = new Assalariado(nome, cpf, salario, comissao);

        System.out.println("Nome: " + a.getNome());
        System.out.println("CPF: " + a.getCpf());
        System.out.println("Salário: " + a.getSalario());
        System.out.println("Comissão: " + a.getComissao() + "%");

        a.descontarInss(100);
        System.out.println("Salário com desconto: " + a.getSalario());

        a.calcularAumento(50);
        System.out.println("Salário com aumento: " + a.getSalario());
    }
}
