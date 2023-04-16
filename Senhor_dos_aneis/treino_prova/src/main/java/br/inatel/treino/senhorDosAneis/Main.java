package br.inatel.treino.senhorDosAneis;

public class Main {
    public static void main(String[] args) {

        Habitante zangao = new Anao(1445621);
        Habitante eru = new Elfo( 7989313);
        Habitante doende = new Mago(9741319);

        TerraMedia terraMedia = new TerraMedia();

        Arma arma = new Arma();
        Arma arma2 = new Arma();
        arma.magica=true;

        arma.nomeArma= "Danger";

        arma2.nomeArma="katana";
        arma2.magica=false;

        zangao.energia=200f;
        zangao.idade=102;
        zangao.nome="zangão";
        ((Anao) zangao).altura=148f;
        ((Anao) zangao).reino="Narnia";


        eru.nome="Eru";
        eru.idade=150;
        eru.energia=89;
        ((Elfo) eru).tribo="Elfolandia";


        doende.nome="Doende";
        doende.idade=197;
        doende.energia=300;
        ((Mago) doende).cor= "verde";

        terraMedia.addHabitante(zangao);
        terraMedia.addHabitante(eru);
        terraMedia.addHabitante(doende);

        zangao.mostrarInfos();
        ((Anao) zangao).minerar();
        zangao.atacar();

        eru.mostrarInfos();
        ((Elfo) eru).viajar();
        eru.atacar();
        ((Elfo) eru).curar();

        doende.mostrarInfos();
        doende.atacar();
        ((Mago) doende).lancarFeitico();
        ((Mago) doende).curar();

        arma.mostrarInfos();
        arma2.mostrarInfos();

        terraMedia.listarHabitantes();

    }
}
