package br.inatel.aula_8.funcionario.predio6;

public class Professor extends Funcionario2{

    private String materia;

    //reescrita de metodo
    @Override
    public void mostrarInfos(){
        System.out.println("__----INFOS DO PROFESSOR----");
        super.mostrarInfos();
        System.out.println("Matéria: "+materia);
    }

    @Override
    public void executaAcao() {

    }

    public String getMateria() {

        return materia;
    }

    public void setMateria(String materia) {

        this.materia = materia;
    }
}

