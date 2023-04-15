package br.inatel.aula11.mamifero;

public class Lontra extends Mamifero implements Aquatico{
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome+" emitindo som");
    }

    public void nadar() {
        System.out.println(this.nome+" esta nadando");
    }

    @Override
    public void mostrarInfos(){
        System.out.println("----INFOS DA LONTRA----");
        super.mostrarInfos();

    }
}
