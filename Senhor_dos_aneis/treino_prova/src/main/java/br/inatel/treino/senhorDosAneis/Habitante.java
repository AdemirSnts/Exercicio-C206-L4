package br.inatel.treino.senhorDosAneis;

public abstract class Habitante {

    public Habitante(int id) {
        this.id = id;
    }

    public static int contador=0;

    public static int getContador() {

        return contador;
    }

    public static void setContador(int contador) {

        Habitante.contador = contador;
    }

    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    public void atacar(){

        if (Arma.magica == true) {
            System.out.println("Energia: "+(this.energia-20));
        }
        else
            System.out.println("Energia: "+(this.energia-10));
    }
    public void mostrarInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Energia: "+this.energia);
        System.out.println("Idade: "+this.idade+" anos");
        System.out.println("Identificação: "+this.id);

    }
}
