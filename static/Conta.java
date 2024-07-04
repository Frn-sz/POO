public class Conta {
  protected int numero;
  protected Pessoa correntista;
  protected float saldo;
  private static int numeroContas;

  public Conta() {
    incrementa();
  }

  public Conta(int numero, Pessoa correntista) {
    this.numero = numero;
    this.correntista = correntista;
    this.saldo = 0.00f;
    incrementa();
  }

  private static void incrementa() {
    numeroContas++;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Pessoa getCorrentista() {
    return correntista;
  }

  public void setCorrentista(Pessoa correntista) {
    this.correntista = correntista;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public static int getNumeroContas() {
    return numeroContas;
  }
}