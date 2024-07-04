
public abstract class Conta {
    protected int numero;
    protected float saldo;
    protected Pessoa correntista;

    public Conta() {
    }

    public Conta(int numero, float saldo, Pessoa correntista) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public abstract float sacar(float valor);
}
