
public class appEscola {
  public static void main(String[] args) {
    Professor p = new Professor(
        "Jonas",
        "jonas@mail.com",
        13312,
        31231231,
        "Literatura",
        "Humanas");

    Aluno a = new Aluno(
        "Kleber",
        "kleber@mail",
        121331,
        132131231,
        "Letras");

    Disciplina d = new Disciplina(
        "Litratura Brasileira",
        p,
        200);


      System.out.println("Nome da disciplina: " + d.getNome());
      System.out.println("Professor da disciplina: " + d.getProfessor().getNome());
      System.out.println("Carga Horária: " + d.getHoras());


  }
}
