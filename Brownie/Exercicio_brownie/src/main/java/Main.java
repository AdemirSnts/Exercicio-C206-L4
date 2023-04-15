public class Main {
    public static void main(String[] args) {

        Brownie bc = new BrownieCafe("Brownie de Café", 15, "Capuccino");
        Brownie bn = new BrownieNutella("Brownie de nutella", 20, "Trufado");
        Brownie bdl = new BrownieDoceDeLeite("brownie de Doce de Leite", 30, "Cremoso");

        Comprador comprador = new Comprador("Francisco Correia", 1500);


        bdl.mostrarInfos();
        bn.mostrarInfos();
        bc.mostrarInfos();

        comprador.efetuarCompra(bdl);
        bdl.addCarrinhoDeCompras();
        bdl.calculaValorTotalCompra();


        comprador.efetuarCompra(bn);
        bn.addCarrinhoDeCompras();
        bn.calculaValorTotalCompra();


        comprador.efetuarCompra(bc);
        bc.addCarrinhoDeCompras();
        bc.calculaValorTotalCompra();

        comprador.mostrarInfos();


        System.out.println("O valor total da compra foi de: "+(comprador.saldo-(bc.preco+ bn.preco+ bdl.preco)));
    }
}
