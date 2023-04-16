package br.inatel.treino.senhorDosAneis;

public class Elfo extends Habitante implements Cura{
    String tribo;

    public Elfo(int id) {
        super(id);
    }


    public void viajar(){

        System.out.println("O elfo está viajando");
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void mostrarInfos() {
        System.out.println("----INFOS DO ELFO-----");
        super.mostrarInfos();
    }

    @Override
    public void curar() {

        System.out.println("Ele foi curado "+(this.energia+(this.energia*0.15)));
    }
}
