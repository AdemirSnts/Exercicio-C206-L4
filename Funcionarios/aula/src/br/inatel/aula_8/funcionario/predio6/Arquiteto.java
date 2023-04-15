package br.inatel.aula_8.funcionario.predio6;

public class Arquiteto extends Funcionario2 implements GerenciarProjetos{

    private String especialidade;

    @Override
    public void mostrarInfos(){
        System.out.println("__----INFOS DO ARQUITETO----");
        super.mostrarInfos();
        System.out.println("Especialidade: "+this.especialidade);
    }
    @Override
    public void executaAcao(){
        this.mostrarInfos();
        System.out.println(this.getNome() + " esta fazendo a planta de uma casa");
    }
    @Override
    public String getNome() {

        return super.getNome();
    }

    public String getEspecialidade() {

        return especialidade;
    }

    public void setEspecialidade(String especialidade) {

        this.especialidade = especialidade;
    }

    @Override
    public void gerenciarProjetos() {
        this.mostrarInfos();
        System.out.println("Este arquiteto está gerenciando o projeto");

    }
}
