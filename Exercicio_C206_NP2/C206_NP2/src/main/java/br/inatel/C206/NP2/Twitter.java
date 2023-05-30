package br.inatel.C206.NP2;

public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {

        System.out.println("Compartilhou um Tweet!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no twitter!");
    }

    @Override
    public void postarComentario() {

        System.out.println("Fez um tweet em uma publicação no Twitter!");
    }
}
