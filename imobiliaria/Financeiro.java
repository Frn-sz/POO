/**
 * Financeiro
 */
public class Financeiro {

    public Financeiro() {

    }

    public static float calcularFinanciamento(float montante, int meses, float taxa) {
        for (int i = 0; i < meses; ++i)
            montante *= taxa;

        return montante;
    }

    public static float calcularAcrescimo(float montante, float juros) {
        return montante * juros;
    }

    public static float calcularDesconto(float montante, float percentual) {
        return montante * percentual;
    }
}