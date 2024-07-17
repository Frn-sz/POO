import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String usuario;
    private int ano;
    private List<Compromisso> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<Compromisso>();
    }


    public Agenda(String usuario, int ano) {
        this.usuario = usuario;
        this.ano = ano;
        this.compromissos = new ArrayList<Compromisso>();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Compromisso> getCompromissos() {
        return compromissos;
    }

    public Compromisso getCompromisso(int dia, int mes, int hora) throws CompromissoInexistente {
        for (Compromisso c : this.compromissos)
            if (c.getDia() == dia && c.getMes() == mes && c.getHora() == hora)
                return c;
        throw new CompromissoInexistente(dia, mes, hora);
    }

    public void addCompromisso(Compromisso compromisso) {
        this.compromissos.add(compromisso);
    }

    public boolean delCompromisso(Compromisso compromisso) {
        return this.compromissos.remove(compromisso);
    }
}
