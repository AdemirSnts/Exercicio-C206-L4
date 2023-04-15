package br.inatel.aula11.mamifero;

public abstract class  Mamifero {
    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    public abstract void emitirSom();

    public void mostrarInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Vida: "+this.vida+" anos");
    }
}
