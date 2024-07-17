import java.util.Scanner;


public class appEstacionamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a descrição da categoria: ");
        String desc = scanner.nextLine();

        System.out.println("Digite o valor da categoria: ");
        float val = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite a placa do veículo: ");
        String placa = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        long rg = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Digite a quantidade de horas da estadia: ");
        int horas = scanner.nextInt();
        scanner.nextLine();

        Categoria categoria = new Categoria(desc, val);
        Veiculo veiculo = new Veiculo(placa, rg, categoria);
        Estadia estadia = new Estadia(veiculo, horas);

        System.out.println("O total a ser pago é: " + estadia.calcularEstadia());
        System.out.println("Informações adicionais: ");
        System.out.println("Categoria: " + categoria.getDescricao());
        System.out.println("Valor da categoria: " + categoria.getValor());
        System.out.println("Placa do veículo: " + veiculo.getPlaca());
        System.out.println("RG: " + veiculo.getRg());
        System.out.println("Horas de estadia: " + estadia.getHoras());
    }
}
