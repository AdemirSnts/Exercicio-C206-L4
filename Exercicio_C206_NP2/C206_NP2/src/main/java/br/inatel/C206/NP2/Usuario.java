package br.inatel.C206.NP2;

import java.util.ArrayList;

public class Usuario {
    String nome;
    String email;



    Facebook facebook = new Facebook("*****", 2000);

    Instagram instagram = new Instagram("@@@@@@@@@", 99000);
    public Usuario(ArrayList<RedeSocial> redesSociais ){

        redesSociais.add(facebook);
        redesSociais.add(instagram);
        try {
            if (facebook.equals(redesSociais)) {
                if (instagram.equals(redesSociais)) {

                    throw new NullPointerException();
                }
            }
            } catch (Exception e) {
                System.out.println("Opção incorreta!");

            }

        for (int i = 0; i < redesSociais.size(); i++) {
            System.out.println("Senha: " + redesSociais.get(i).getSenha());
            System.out.println("Numero de amigos: " + redesSociais.get(i).getNumAmigos());

        }

    }

    public void mostrarInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
//        System.out.println("Rede Social: "+this.redeSocial2);

    }
}
