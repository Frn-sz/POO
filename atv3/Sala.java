public class Sala {
    int numero;
    String nome;

    public Sala(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
