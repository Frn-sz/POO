public class Pessoa {

  private String nome;

  private String email;

  private long celular;

  public Pessoa(String nome, String email, long celular) {
    this.nome = nome;
    this.celular = celular;
    this.email = email;
  }

  public String get_nome() {
    return this.nome;
  }

  public void set_nome(String nome) {
    this.nome = nome;
  }

  public String get_email() {
    return this.email;
  }

  public void set_email(String email) {
    this.email = email;
  }

  public long get_celular() {
    return this.celular;
  }

  public float calculoIR(float valor) {
    return valor * 0.02f;
  }
}
