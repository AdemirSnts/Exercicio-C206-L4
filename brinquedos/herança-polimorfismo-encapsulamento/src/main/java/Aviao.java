public class Aviao extends Brinquedo{
    int qtdMotores=2;


    @Override
    public void mostrarInfos(){
        System.out.println("----INFOS DO AVIÃO------");
        super.mostrarInfos();
        System.out.println("Quantidade de motores: "+this.qtdMotores);
    }
}
