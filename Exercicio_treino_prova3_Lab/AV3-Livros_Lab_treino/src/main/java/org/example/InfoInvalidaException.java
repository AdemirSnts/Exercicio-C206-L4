package org.example;

public class InfoInvalidaException extends Exception{

    public InfoInvalidaException(String editora){

            System.out.println("Nome da editora esta incorreto");

    }
    public InfoInvalidaException(int qtdPaginas){

            System.out.println("Quantidade de paginas invalida!");

    }
}
