/**
 * Pessoa
 */
public abstract class Pessoa {

    protected String nome;
    protected String email;
    protected long celular;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
