public class Brinquedo {

    String modelo;
    String cor;
   public static int qtdBrinquedos = 0;

    public Brinquedo() {

        qtdBrinquedos ++;

    }



    public void mover(){
       System.out.println("O(a) " +this.modelo+  " de cor " +this.cor+ " está se movendo");

    }
    public void ligar(){
        System.out.println("O(a) " +this.modelo+  " de cor " +this.cor+ " já está ligado");

    }
    public static int getQtdBrinquedos() {

        if (qtdBrinquedos == 0)
            System.out.println("Nenhum brinquedo cadastrado");

        else
            System.out.println("Quantidade: "+qtdBrinquedos+" brinquedos");

        return qtdBrinquedos;
    }
    public void mostrarInfos(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
    }

}
