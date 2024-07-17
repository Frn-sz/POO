
public class Disciplina {
  private String nome;
  private Professor professor;
  private int horas;

  public Disciplina() {
  }

  public Disciplina(String nome, Professor professor, int horas) {
    this.nome = nome;
    this.professor = professor;
    this.horas = horas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

}
