package br.inatel.aula13Teorica.Exercicio.exception;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Tio",2344);
        Cliente cliente2 = new Cliente("Tia",8975);
        Cliente cliente3 = null;

        Conta conta = new Conta(1500, 500);

        conta.addCliente(cliente1); //cliente tio
        conta.addCliente(cliente2); //cliente tia
        conta.addCliente(cliente3); //cliente null

        conta.mostraInfos();
        conta.sacar(200);
        System.out.println();


        System.out.println("Fim da main!");
    }
}
