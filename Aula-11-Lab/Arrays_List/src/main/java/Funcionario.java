public class Funcionario implements Comparable<Funcionario>{

   private String nome;
   private int idade;

   private float salario;

    public Funcionario(String nome, int idade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }

    public float getSalario() {
        return salario;
    }

    //Método que servira para realizar as comparações
    @Override
    public int compareTo(Funcionario func) {

        //return nome.compareTo(func.nome); //Comparaando pelo nome
        //return Integer.compare(this.idade, func.getIdade()); //Comparando pel idade
        return Float.compare(this.salario, func.getSalario());
    }
}
