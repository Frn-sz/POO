public class appCinema {

    public static void main(String[] args) {
        Sala sala = new Sala(1, "Sala do meio");
        Sala sala2 = new Sala(1, "Sala da direita");
        Sala sala3 = new Sala(1, "Sala da esquerda");
        
        
        Filme f1 = new Filme("Super bad", 120, sala);
        Filme f2 = new Filme("Avatar", 120, sala2);
        Filme f3 = new Filme("Até que a sorte nos separe", 120, sala3);
  
        System.out.printl("Filme: " + f1.titulo + " na sala " + f1.sala.nome);
        System.out.println("Filme: " + f2.titulo + " na sala " + f2.sala.nome);
        System.out.println("Filme: " + f2.titulo + " na sala " + f3.sala.nome);

    }
}
