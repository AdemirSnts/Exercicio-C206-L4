
public class Main {

    public static void main(String[] args) {

        ColecaoBrinquedos cb = new ColecaoBrinquedos();
        
        Brinquedo car = new Carrinho();
        Brinquedo aviao = new Aviao();
        Brinquedo barco = new Barco();

        car.modelo = "Ferrari";
        car.cor = "azul";

        aviao.cor= "preto";
        aviao.modelo= "helicoptero";



        barco.cor= "branco";
        barco.modelo="veleiro";

        car.mostrarInfos();
        car.ligar();
        car.mover();
        aviao.mostrarInfos();
        aviao.ligar();
        aviao.mover();
        barco.mostrarInfos();
        barco.ligar();
        barco.mover();
        cb.adicionarBrinquedos(car);
        cb.adicionarBrinquedos(aviao);
        cb.adicionarBrinquedos(barco);
         cb.listarBrinquedos();
        Brinquedo.getQtdBrinquedos();

    }
}
