import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Estudantes> estudantes = new ArrayList<>();
        Estudantes soft = new Estudantes("Ademir",25);
        Estudantes comp = new Estudantes("Wagner",30);
        Estudantes bio = new Estudantes("Sofia",22);

        estudantes.add(soft);
        estudantes.add(comp);
        estudantes.add(bio);


        for (int i = 0; i < estudantes.size() ; i++) {
            System.out.println("Nome: "+estudantes.get(i).getNome()+" Idade: "+estudantes.get(i).getIdade());
        }
        Collections.sort(estudantes);

        System.out.println("*****DEPOIS DA ORDENAÇÃO EM ORDEM CRESCENTE*****");
        for (int i = 0; i < estudantes.size() ; i++) {
            System.out.println("Nome: "+estudantes.get(i).getNome()+" Idade: "+estudantes.get(i).getIdade());
        }

        Collections.reverse(estudantes);
        System.out.println("*****DEPOIS DA ORDENAÇÃO EM ORDEM DECRESCENTE*****");
        for (int i = 0; i < estudantes.size() ; i++) {
            System.out.println("Nome: "+estudantes.get(i).getNome()+" Idade: "+estudantes.get(i).getIdade());
        }
    }
}
