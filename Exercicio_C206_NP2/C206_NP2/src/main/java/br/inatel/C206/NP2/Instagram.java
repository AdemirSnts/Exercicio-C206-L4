package br.inatel.C206.NP2;

public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no insta!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no insta!");
    }

    @Override
    public void postarComentario() {

        System.out.println("Fez um comentario em um reels no insta!");
    }
}
