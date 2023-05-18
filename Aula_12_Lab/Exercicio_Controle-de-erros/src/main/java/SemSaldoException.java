public class SemSaldoException extends Exception{//herdando de exceção
    public SemSaldoException(double saldo, double valorSaque) {
        System.out.println("Nao foi possivel sacar");
        System.out.println(saldo+ " < " +valorSaque);
    }

}
