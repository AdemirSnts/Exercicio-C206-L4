public class ContaPoupanca {

    String nomeTitular; //Nome do titular da conta
    String numConta; //Numero da conta
    double saldo; //saldo da conta

    void verificarSaldo(){
        System.out.println("Saldo: "+this.saldo+" R$");

    }
    void mostrarInfo(){
        System.out.println("Nome do titular: "+this.nomeTitular);
        System.out.println("Numero da conta: "+this.numConta);

    }
}
