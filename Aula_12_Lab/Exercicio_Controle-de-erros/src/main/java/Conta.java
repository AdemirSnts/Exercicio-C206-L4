public class Conta {
    //Atributos da conta
    private int numConta;
    private double saldo;

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //metodos da conta
    public void sacar(double valorSaque){
        //Tratamento do erro
        try{
            //verifica se o valor de saldo é menor do que o valor do saque
            if (valorSaque>this.saldo){
                throw new SemSaldoException(this.saldo,valorSaque);
            }else {
                this.saldo-=valorSaque;
                System.out.println("Novo saldo: "+this.saldo+ " R$");
            }
        }catch (SemSaldoException s){
            System.out.println(s);
        }
    }
}
