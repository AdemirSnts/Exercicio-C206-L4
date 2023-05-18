import java.util.Scanner;

public class Funcionario {
   private String nome;
    private int idade;
    private String cargo;
    private float salario;


    public Funcionario(String nomeFunc, float salarioFunc, String cargoFunc, int idadeFunc) {
        this.nome = nomeFunc;
        this.salario = salarioFunc;
        this.idade = idadeFunc;
        this.cargo = cargoFunc;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }
    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }
}
