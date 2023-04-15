//Executa uma ação em outra classe

public class Comprador {
    String nome;
    double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
    public void efetuarCompra(Brownie brownie){

        System.out.println("Comprando um "+brownie.nome);
    }

    public void mostrarInfos(){
        System.out.println("----INFOS DO COMPRADOR-----");
        System.out.println("Nome: "+this.nome);
        System.out.println("Saldo: "+this.saldo);

    }

}
