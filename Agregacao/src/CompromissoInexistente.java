public class CompromissoInexistente extends Exception {
    private int dia;
    private int mes;
    private int hora;

    public CompromissoInexistente(int dia, int mes, int hora) {
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Compromisso inexistente: " + dia + "/" + mes + " às " + hora + " horas";
    }
}
