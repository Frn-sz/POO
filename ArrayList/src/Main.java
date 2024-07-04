import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List lista = new ArrayList();
        List lista2,lista3 = new ArrayList(5);

        for (int i = 0; i < 10; ++i) {
            lista.add(i);
        }

        lista2 = new ArrayList(lista);
        lista3.add(lista);
        lista3.addAll(lista2);

        for (Object o : lista3) {
            System.out.println(o);
        }
    }
}