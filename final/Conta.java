/**
 * Conta
 */
public class Conta {
  private int numero;
  private Pessoa correntista;
  private float saldo;
  public final static int SACAR = 0;
  public final static int DEPOSITAR = 1;

  public Conta(int numero, Pessoa correntista) {
    this.numero = numero;
    this.correntista = correntista;
  }

  public boolean movimentar(float valor, int operador) {
    if (operador == Conta.SACAR) {
      if (this.saldo - valor < 0)
        return false;
      this.saldo -= valor;
    } else if (operador == Conta.DEPOSITAR) {
      this.saldo += valor;
    }

    return true;
  }

  public Pessoa getCorrentista() {
    return correntista;
  }

  public int getNumero() {
    return numero;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setCorrentista(Pessoa correntista) {
    this.correntista = correntista;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
}