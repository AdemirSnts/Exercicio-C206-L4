package br.inatel.treino.senhorDosAneis;

public class Anao extends Habitante implements Mineracao{
    public float altura;
    String reino;

    public Anao(int id) {
        super(id);
    }


    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void mostrarInfos() {
        System.out.println("----INFOS DO ANÃO-----");
        super.mostrarInfos();
    }

    @Override
    public void minerar() {
        System.out.println("O anão está minerando");
    }
}
