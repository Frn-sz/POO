public class Assalariado extends Funcionario implements Encargos {
    private double comissao;

    public Assalariado() {
        super();
    }

    public Assalariado(String nome, long cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void calculaComissao(float percentual, double totalVendas) {
        this.comissao = percentual * totalVendas;
    }

    @Override
    public void descontarInss(float taxa) {
        this.salario -= taxa;
    }

    @Override
    public void calcularAumento(float percentual) {
        this.salario += this.salario * (percentual/100);
    }
}
