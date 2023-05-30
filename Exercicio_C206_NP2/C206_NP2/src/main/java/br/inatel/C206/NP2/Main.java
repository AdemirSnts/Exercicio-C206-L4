package br.inatel.C206.NP2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<RedeSocial> redesSociais = new ArrayList<>();

        Facebook facebook = new Facebook("*****", 2000);
        // GooglePlus googlePlus = new GooglePlus("######",50);
        //Twitter twitter = new Twitter("§§§§§§§",15000);
        Instagram instagram = new Instagram("@@@@@@@@@", 99000);

        Usuario usuario = new Usuario(redesSociais);
        usuario.nome = "Gustavo";
        usuario.email = "Gustavo@hotmail.com";


        usuario.mostrarInfos();


        facebook.curtirPublicacao();
        facebook.compartilhar();
        facebook.fazStreaming();

        instagram.postarComentario();
        instagram.postarFoto();
        instagram.curtirPublicacao();




    }
}