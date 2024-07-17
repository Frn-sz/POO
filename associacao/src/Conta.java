public class Conta {
    int codigo;
    Pessoa pessoa;

    private float saldo;

    public Conta(){

    }

    public Conta(int codigo, Pessoa pessoa){
        this.codigo = codigo;
        this.pessoa = pessoa;
        this.saldo = 0.00f;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (this.saldo - valor >= 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
