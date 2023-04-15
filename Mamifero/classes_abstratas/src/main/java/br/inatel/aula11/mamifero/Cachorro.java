package br.inatel.aula11.mamifero;

public class Cachorro extends Mamifero{

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome+" latindo");
    }
    @Override
    public void mostrarInfos(){
        System.out.println("----INFOS DO CACHORRO----");
        super.mostrarInfos();


    }
}
