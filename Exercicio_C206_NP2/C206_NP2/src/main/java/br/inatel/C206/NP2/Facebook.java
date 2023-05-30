package br.inatel.C206.NP2;

public class Facebook extends RedeSocial implements VideoConferencia,Compartilhamento{

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {

        System.out.println("Compartilhou uma foto no  Facebook!");
    }

    @Override
    public void fazStreaming() {

        System.out.println("Iniciou uma chamada de video no Facebook!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no facebook!");
    }

    @Override
    public void postarComentario() {

        System.out.println("Fez um comentario em uma publicação no facebook!");
    }
}
