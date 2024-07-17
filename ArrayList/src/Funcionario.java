/**
 * Funcionario
 */
public class Funcionario extends Pessoa {

    private String cargo;
    private float salario;

    public Funcionario(String nome, String cargo, float salario) {
        super(nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void calcularAumento(float percentual) {
        this.salario *= percentual;
    }

    public String getCargo() {
        return this.cargo;
    }

    public float getSalario() {
        return this.salario;
    }
}
