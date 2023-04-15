package br.inatel.aula_8.funcionario.predio6;

public abstract class Funcionario2 {
    //Funcionarios atributos
    private String nome;
    private int anoNascimento;

    //metodo
    public void mostrarInfos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de nascimento: " + this.anoNascimento);

    }
    //metodos do funcionario
    public abstract void executaAcao();

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    //reescrita de metodo
    //public abstract void mostrarinfos();
}
