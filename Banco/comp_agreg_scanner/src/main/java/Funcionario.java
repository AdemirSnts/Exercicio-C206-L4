public class Funcionario {
    String nome;
    int cpf;
    int idade;
    double salario;

    public void mostrarInfos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario anual " + this.salario*12);
    }

    public void calcularSalarioAnual() {
        double salarioAnual;

        salarioAnual = salario * 12;

    }

    public void tirarFerias() {

        System.out.println("O funcionario(a): " + this.nome + " tirou férias ");
    }
}


