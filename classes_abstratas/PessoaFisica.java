/**
 * PessoaFisica
 */
public class PessoaFisica extends Pessoa {

    private long cpf;

    public PessoaFisica(String nome, String email, long celular, long cpf) {
        super(nome, email, celular);
        this.cpf = cpf;
    }

    @Override
    public float calculoIR(float valor) {
        return valor * 0.05f;
    }
}