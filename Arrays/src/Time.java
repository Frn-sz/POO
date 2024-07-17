public class Time {
    private String nome;
    private int pontos;
    private final int[] resultados;

    public Time() {
        this.resultados = new int[3];
    }

    public Time(String nome) {
        this.nome = nome;
        this.resultados = new int[3];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public int[] getResultadps() {
        return resultados;
    }

    public void setVitorias(int vitorias) {
        this.resultados[0] = vitorias;
    }

    public void setEmpates(int empates) {
        this.resultados[1] = empates;
    }

    public void setDerrotas(int derrotas) {
        this.resultados[2] = derrotas;
    }

    public void calcularPontuacao() {
        this.pontos = this.resultados[0] * 3 + this.resultados[1];
    }
}


