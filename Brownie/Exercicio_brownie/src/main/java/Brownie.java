public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;
    public static double valorCompra =0;
    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }
    public void addCarrinhoDeCompras(){

        System.out.println("foi adicionado ao carrinho de compras");
    }
    public void calculaValorTotalCompra(){

      valorCompra=preco;

    }

    public void mostrarInfos(){

        System.out.println("Nome: "+this.nome);
        System.out.println("Sabor: "+this.sabor);
        System.out.println("Tem o preço de: "+this.preco);

    }
}
