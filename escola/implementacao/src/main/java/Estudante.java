public class Estudante {
    //atributos do estudante
    String nome;
    int idade;
    String ano;

    //construtor


    public Estudante(String nome, int idade, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    //metodos do estudante
    void mostraInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Ano letivo: "+this.ano);
    }
}
