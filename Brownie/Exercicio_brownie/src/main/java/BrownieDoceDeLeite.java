public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    @Override
    public void addCarrinhoDeCompras(){

        System.out.println("Brownie de Doce de leite adicionado ao carrinho de compras");
    }
    @Override
    public void mostrarInfos(){
        System.out.println("----INFOS DO BROWNIE DE DOCE DE LEITE------");
        super.mostrarInfos();
    }
}
