import java.util.List;
import java.util.Scanner;

public class appAgenda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do usuário:");
        String usuario = s.nextLine();
        System.out.println("Digite o ano da agenda");
        int ano = s.nextInt();

        Agenda a = new Agenda(usuario, ano);


        while (true) {
            System.out.println("Digite o dia do compromisso (0 para sair):");
            int dia = s.nextInt();

            if (dia == 0)
                break;

            System.out.println("Digite o mês do compromisso:");
            int mes = s.nextInt();
            System.out.println("Digite a hora do compromisso:");
            int hora = s.nextInt();
            s.nextLine();
            System.out.println("Digite a descrição do compromisso:");
            String descricao = s.nextLine();

            Compromisso c = new Compromisso(dia, mes, hora, descricao);

            a.addCompromisso(c);

        }

        List<Compromisso> compromissos = a.getCompromissos();

        listCompromissos(a);

        System.out.println("Digite o dia do compromisso a ser excluído:");
        int dia = s.nextInt();
        System.out.println("Digite o mês do compromisso a ser excluído:");
        int mes = s.nextInt();
        System.out.println("Digite a hora do compromisso a ser excluído:");
        int hora = s.nextInt();

        try {
            Compromisso comp = a.getCompromisso(dia, mes, hora);
            a.delCompromisso(comp);
            System.out.println("Compromisso excluído com sucesso!");
        } catch (CompromissoInexistente c) {
            System.out.println(c);
        }

        listCompromissos(a);

        System.out.println("Digite o dia do compromisso a ser pesquisado:");

        dia = s.nextInt();

        System.out.println("Digite o mês do compromisso a ser pesquisado:");
        mes = s.nextInt();

        System.out.println("Digite a hora do compromisso a ser pesquisado:");
        hora = s.nextInt();
        try {
            Compromisso c = a.getCompromisso(dia, mes, hora);
            System.out.println("Compromisso encontrado: " + c.getDescricao());
        } catch (CompromissoInexistente c) {
            System.out.println(c);
        }
    }

    private static void listCompromissos(Agenda a) {
        System.out.println("Agenda de compromissos de " + a.getUsuario() + "\t Ano: " + a.getAno());
        System.out.println("Data \t Hora \t Descrição");
        for (Compromisso c : a.getCompromissos()) {
            System.out.print(c.getDia() + "/" + c.getMes() + "\t");
            System.out.print(c.getHora() + "\t");
            System.out.print(c.getDescricao());
            System.out.println();
        }
    }

}