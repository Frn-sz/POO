import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Time[] times = new Time[3];
        String[] pos = {"vitórias", "empates", "derrotas"};

        String name;

        for (int i = 0; i < times.length; i++) {
            System.out.println("Digite o nome do time " + (i + 1));
            name = s.nextLine();
            times[i] = new Time(name);
        }

        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o total de " + pos[j] + " do time " + (i + 1));
                int response = s.nextInt();
                switch (j) {
                    case 0://///////do
                        times[i].setVitorias(response);
                        break;
                    case 1:
                        times[i].setEmpates(response);
                        break;
                    case 2:
                        times[i].setDerrotas(response);
                        break;
                }
            }
        }

        for (Time time : times) {
            time.calcularPontuacao();
            System.out.println("Nome do time: " + time.getNome());
            System.out.println("Pontuação do time: " + time.getPontos());
        }
    }
}