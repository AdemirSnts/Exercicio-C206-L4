import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Double> listaDouble = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            listaDouble.add(new Random().nextDouble()*100);
        }

        System.out.println("Antes da ordenação");

        for (int i = 0; i < 5; i++) {
            System.out.println(listaDouble);
        }
        System.out.println("Ordenada crescente");
        Collections.sort(listaDouble);
        for (int i = 0; i <5 ; i++) {
            System.out.println(listaDouble);
        }
        System.out.println("Ordenada decrescente");
        Collections.reverse(listaDouble);
        for (int i = 0; i < 5; i++) {
            System.out.println(listaDouble);
        }
        }
    }

