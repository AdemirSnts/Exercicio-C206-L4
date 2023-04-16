package br.inatel.treino.senhorDosAneis;

public class Mago extends Habitante implements Cura,Feitico{
    String cor;

    public Mago(int id) {
        super(id);
    }


    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void mostrarInfos() {
        System.out.println("----INFOS DO MAGO-----");
        super.mostrarInfos();
    }


    @Override
    public void curar() {
        System.out.println("Ele foi curado "+(this.energia+(this.energia*0.15)));
    }

    @Override
    public void lancarFeitico() {

        System.out.println("Energia: "+(energia-(energia*0.1)));
        System.out.println("O mago lançou feitiço");

    }
}
