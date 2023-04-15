public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);

    }
    @Override
    public void addCarrinhoDeCompras(){

        System.out.println("Brownie de Nutella adicionado ao carrinho de compras");
    }

    @Override
    public void mostrarInfos(){
        System.out.println("----INFOS DO BROWNIE DE NUTELLA------");
        super.mostrarInfos();
    }
}
