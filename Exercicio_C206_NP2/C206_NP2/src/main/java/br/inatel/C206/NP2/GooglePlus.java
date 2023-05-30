package br.inatel.C206.NP2;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {

        System.out.println("Compartilhou um video no Google Plus!");
    }

    @Override
    public void fazStreaming() {

        System.out.println("Inciou uma video conferência no Google Plus!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto google plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no google plus!");
    }

    @Override
    public void postarComentario() {

        System.out.println("Fez um comentario em uma publicação no google plus!");
    }
}
