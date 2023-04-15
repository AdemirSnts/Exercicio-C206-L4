package br.inatel.aula_8.funcionario.predio6;


import br.inatel.aula_8.funcionario.predio6.Arquiteto;

public class Main {
    public static void main(String[] args) {

        Arquiteto arq = new Arquiteto();
        arq.setNome("Andre");
        arq.setAnoNascimento(1978);
        arq.setEspecialidade("projetista");
        arq.executaAcao();
        arq.gerenciarProjetos();

        Professor prof = new Professor();
        prof.setNome("Juliano");
        prof.setAnoNascimento(1989);
        prof.setMateria("POO");

        Engenheiro eng = new Engenheiro();
        eng.setNome("Ademir");
        eng.setAnoNascimento(1997);
        eng.setRamoAtuacao("programador");
        eng.executaAcao();
        eng.gerenciarProjetos();

        //Mostrando informações
        arq.mostrarInfos();
        prof.mostrarInfos();
        eng.mostrarInfos();
        Funcionario.getContaFuncionarios();

    }
}