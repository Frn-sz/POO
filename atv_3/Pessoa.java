

public class Pessoa {
  private String email;
  private String nome;
  private long celular;

  public Pessoa() {
  }

  public Pessoa(String nome, String email, long celular) {
    this.email = email;
    this.nome = nome;
    this.celular = celular;
  }

  public long getCelular() {
    return celular;
  }

  public void setCelular(long celular) {
    this.celular = celular;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
