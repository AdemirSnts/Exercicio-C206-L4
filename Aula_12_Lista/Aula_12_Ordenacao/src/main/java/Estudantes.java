import java.util.List;

public class Estudantes implements Comparable<Estudantes>{
   private String nome;
   private int idade;

    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Estudantes estudantes) {


         return nome.compareTo(estudantes.getNome());//Comparando pelo nome
        //Comparando pela idade: return Integer.compare(estudantes.getIdade(), this.idade);
    }
}
