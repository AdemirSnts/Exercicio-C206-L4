package br.inatel.aula_8.funcionario.predio6;

public class Funcionario {
    //Criando um id unico para o funcionario
    public String nome;
    private static int contaFuncionarios = 0;
    public int id;

    public Funcionario(){
        contaFuncionarios++; //imcrementando o atributo estatico
        this.id = contaFuncionarios; //Armazenando o avlor incremental nos funcionarios
    }

    //métodos
    public void mostrarInfos(){
        System.out.println("----- infos dos funcionarios -------");
        System.out.println("Nome: "+nome);
        System.out.println("identificação: "+id);

    }
    //getter
    public static int getContaFuncionarios(){
        if(contaFuncionarios==0)
            System.out.println("Não há funcionarios cadastrados");

        return contaFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
