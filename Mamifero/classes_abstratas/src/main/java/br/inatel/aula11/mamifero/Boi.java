package br.inatel.aula11.mamifero;

public class Boi extends Mamifero{
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome+" mogindo");
    }
    @Override
    public void mostrarInfos(){
        System.out.println("----INFOS DO BOI----");
        super.mostrarInfos();

    }
}
