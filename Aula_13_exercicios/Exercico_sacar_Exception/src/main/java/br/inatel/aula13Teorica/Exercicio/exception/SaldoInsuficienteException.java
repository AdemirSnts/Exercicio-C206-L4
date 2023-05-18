package br.inatel.aula13Teorica.Exercicio.exception;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(double saldo, double limite) {
        System.out.println("Impossivel sacar!");
        System.out.println("Saldo: " + saldo + " menor do que o valor para ser sacado: " + limite);
    }
}
