
public class appElevador {

  public static void main(String[] args) {
    Elevador e = new Elevador(5, 5);

    entrar(e, 2);
    entrar(e, 1);
    subir(e);
    sair(e, 3);

    for (int i = e.andar_atual; i < e.qnt_andares; ++i)
      subir(e);

    subir(e);

    entrar(e, 4);

    for (int i = e.andar_atual; i > 0; --i)
      descer(e);

    descer(e);

  }

  private static void entrar(Elevador e, int pessoas_a_entrar) {
    if (e.entrar(pessoas_a_entrar)) {
      System.out.println("Entraram " + pessoas_a_entrar + " pessoas.");
    } else {
      System.out.println("Número de pessoas ultrapassa a capacidade do elevador.");
    }
  }

  private static void sair(Elevador e, int pessoas_a_sair) {
    if (e.sair(pessoas_a_sair)) {
      System.out.println("Saíram " + pessoas_a_sair + " pessoas.");
    } else {
      System.out.println("Número de pessoas inválido (resultado negativo).");
    }
  }

  private static void subir(Elevador e) {
    if (e.subir()) {
      System.out.println("Andar: " + e.andar_atual + ".");
    } else {
      System.err.println("Elevador no andar máximo!");
    }
  }

  private static void descer(Elevador e) {
    if (e.descer()) {
      System.out.println("Andar: " + e.andar_atual + ".");
    } else {
      System.err.println("Elevador no andar mínimo!");
    }
  }
}
