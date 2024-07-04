
public class Professor extends Pessoa {
  private int siape;
  private String area;
  private String departamento;

  public Professor() {
    super();
  }

  public Professor(String nome, String email, long celular, int siape, String area, String departamento) {
    super(nome, email, celular);
    this.siape = siape;
    this.area = area;
    this.departamento = departamento;
  }

  public int getSiape() {
    return siape;
  }

  public void setSiape(int siape) {
    this.siape = siape;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

}