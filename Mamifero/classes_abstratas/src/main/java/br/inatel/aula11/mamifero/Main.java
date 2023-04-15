package br.inatel.aula11.mamifero;

public class Main {
    public static void main(String[] args) {

        Mamifero dog = new Cachorro("Spyke", 15);
        Mamifero lontra = new Lontra("Foca", 10);
        Mamifero boi = new Boi("mimoso", 30);

       dog.mostrarInfos();
        dog.emitirSom();

       lontra.mostrarInfos();
        lontra.emitirSom();
        ((Lontra) lontra).nadar();

       boi.mostrarInfos();
        boi.emitirSom();

    }
}
