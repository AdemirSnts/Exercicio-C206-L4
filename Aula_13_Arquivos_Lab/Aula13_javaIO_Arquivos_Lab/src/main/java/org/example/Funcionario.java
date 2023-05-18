package org.example;

public class Funcionario {
    private String nome;
    private double salario;
    private int idade;

    //construtor

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }
}
