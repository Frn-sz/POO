/**
 * PessoaJuridica
 */
public class PessoaJuridica extends Pessoa {

    private long cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String email, long celular, long cnpj, String razaoSocial) {
        super(nome, email, celular);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public float calculoIR(float valor) {
        return valor * 0.15f;
    }
}