package br.inatel.aula_8.funcionario.predio6;

public class Engenheiro extends Funcionario2 implements GerenciarProjetos{

    private String ramoAtuacao;

    @Override
    public void mostrarInfos(){
        System.out.println("__----INFOS DO ENGENHEIRO----");
        super.mostrarInfos();
        System.out.println("Ramo de Atuação: "+ramoAtuacao);
    }
    @Override
    public void executaAcao(){
        this.mostrarInfos();
        System.out.println(this.getNome() + " esta construindo um aplicativo");
    }

    @Override
    public String getNome() {

        return super.getNome();
    }

    public String getRamoAtuacao() {

        return ramoAtuacao;
    }

    public void setRamoAtuacao(String ramoAtuacao) {

        this.ramoAtuacao = ramoAtuacao;
    }

    @Override
    public void gerenciarProjetos() {
        this.mostrarInfos();
        System.out.println("Este engenheiro esta programando o aplicativo");
    }
}

