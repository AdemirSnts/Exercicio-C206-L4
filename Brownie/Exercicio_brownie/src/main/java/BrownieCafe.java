public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    @Override
    public void addCarrinhoDeCompras(){

        System.out.println("Brownie de Café adicionado ao carrinho de compras");
    }
    @Override
    public void mostrarInfos(){
        System.out.println("----INFOS DO BROWNIE DE CAFÉ------");
        super.mostrarInfos();
    }
}
