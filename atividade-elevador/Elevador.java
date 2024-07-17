public class Elevador {
  int qnt_andares;
  int andar_atual;
  int capacidade;
  int qnt_pessoas;

  public Elevador(int qnt_andares, int capacidade) {
    this.qnt_andares = qnt_andares;
    this.capacidade = capacidade;
    this.qnt_pessoas = 0;
    this.andar_atual = 0;
  }

  public boolean subir() {
    if (this.andar_atual < this.qnt_andares) {
      this.andar_atual++;
      return true;
    }

    return false;
  }

  public boolean descer() {
    if (this.andar_atual > 0) {
      this.andar_atual--;
      return true;
    }
    return false;
  }

  public boolean entrar(int pessoas_a_entrar) {
    if (this.capacidade >= pessoas_a_entrar) {
      this.qnt_pessoas += pessoas_a_entrar;
      return true;
    }
    return false;
  }

  public boolean sair(int pessoas_a_sair) {
    if (this.qnt_pessoas - pessoas_a_sair >= 0) {
      this.qnt_pessoas -= pessoas_a_sair;
      return true;
    }
    return false;
  }
}
