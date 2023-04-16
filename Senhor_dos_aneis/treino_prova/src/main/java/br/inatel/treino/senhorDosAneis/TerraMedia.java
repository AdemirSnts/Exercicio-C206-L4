package br.inatel.treino.senhorDosAneis;

public class TerraMedia {

        int x=0;
    Habitante herois[] = new Habitante[5];

    public void addHabitante(Habitante habitante){
        for (int i = 0; i < herois.length ; i++) {
            if (herois[i] == null) {
                herois[i]=habitante;
                x++;
                break;
            }
        }

    }
    public void listarHabitantes(){

        System.out.println("----LISTA DOS HABITANTES-------");
        for (int i = 0; i < herois.length ; i++) {
            if (herois[i] != null) {
                if(herois[i] instanceof Anao){
                    System.out.println("Zangão");

                }
                if(herois[i] instanceof Elfo){
                    System.out.println("Eru");

                }
                if(herois[i] instanceof Mago){
                    System.out.println("Doende");

                }

            }
        }
        System.out.println("Quantidade de habitantes: "+x);

    }
}
