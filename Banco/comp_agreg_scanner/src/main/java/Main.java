import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciando/Criar um funcionario
        Funcionario func= new Funcionario();

        //Atribuição de
        Scanner sc= new Scanner(System.in);

        System.out.println("Nome do funcionario(a): ");
        func.nome = sc.nextLine(); //para string

        System.out.println("CPF do funcionario(a): ");
        func.cpf = sc.nextInt(); //para inteiro

        System.out.println("Idade do funcionario(a): ");
        func.idade = sc.nextInt();

        System.out.println("Salario do funcionario(a): ");
        func.salario = sc.nextDouble();

        func.mostrarInfos();
        func.calcularSalarioAnual();
        func.tirarFerias();

        sc.close(); // Fechando entrada de dados

    }
}
