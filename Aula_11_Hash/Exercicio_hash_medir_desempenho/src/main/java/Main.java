import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> auxArray = new ArrayList<>();
        HashSet<Integer> auxSet = new HashSet<>();
        HashMap<Integer,Integer> auxMap = new HashMap<>();
        int numValores=100000;
        long tempoInicial;
        long tempoFinal;
        tempoInicial= System.currentTimeMillis();
        for (int i = 0; i <  numValores; i++) {
           auxArray.add(i);

        }
        tempoFinal= System.currentTimeMillis();
        System.out.println("Tempo para inserir no List: "+(tempoFinal-tempoInicial)+" ms");
        for (int i = 0; i <  numValores; i++) {
            auxArray.contains(i);

        }
        tempoFinal= System.currentTimeMillis();
        System.out.println("Tempo para buscar no List: "+(tempoFinal-tempoInicial)+" ms");

        tempoInicial= System.currentTimeMillis();
        for (int i = 0; i <  numValores; i++) {
            auxSet.add(i);

        }
        tempoFinal= System.currentTimeMillis();
        System.out.println("Tempo para inserir no Set: "+(tempoFinal-tempoInicial)+" ms");
        for (int i = 0; i <  numValores; i++) {
            auxSet.contains(i);

        }
        tempoFinal= System.currentTimeMillis();
        System.out.println("Tempo para buscar no Set: "+(tempoFinal-tempoInicial)+" ms");

        tempoInicial= System.currentTimeMillis();
        for (int i = 0; i <  numValores; i++) {
          auxMap.put(i,i);

        }
        tempoFinal= System.currentTimeMillis();
        System.out.println("Tempo para inserir no Map: "+(tempoFinal-tempoInicial)+" ms");
        for (int i = 0; i <  numValores; i++) {
            auxMap.containsKey(i);

        }

        tempoFinal= System.currentTimeMillis();
        System.out.println("Tempo para buscar no Map: "+(tempoFinal-tempoInicial)+" ms");
    }
}
