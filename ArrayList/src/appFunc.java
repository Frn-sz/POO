/**
 * appFunc
 */

import java.util.ArrayList;
import java.util.Scanner;

public class appFunc {

    public static void main(String[] args) {
        ArrayList<Funcionario> func_list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String name, cargo;
        float salario;
        for (int i = 0; i < 3; ++i) {
            System.out.println("Digite o nome da pessoa " + (i + 1));
            name = s.nextLine();
            System.out.println("Digite o cargo da pessoa " + (i + 1));
            cargo = s.nextLine();
            System.out.println("Digite o salario da pessoa " + (i + 1));
            salario = s.nextFloat();
            s.nextLine();
            func_list.add(new Funcionario(name, cargo, salario));
        }

        s.close();

        func_list.forEach(e -> {
            e.calcularAumento(1.2f);
            System.out.println("Nome: " + e.getNome());
            System.out.println("Cargo: " + e.getCargo());
            System.out.println("Salário com aumento: " + e.getSalario());
        });
    }
}
