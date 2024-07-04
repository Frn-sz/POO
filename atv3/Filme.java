public class Filme {
    String titulo;
    int duracao;
    Sala sala;

    public Filme(String titulo,int duracao, Sala sala){
        this.titulo = titulo;
        this.duracao = duracao;
        this.sala = sala;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public Sala getSala() {
        return sala;
    }
}
