public class Main {
    public static void main(String[] args) {

        /*
        int num1=0;
        int num2=0;
        int num3=0;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Entre com o primeiro numero");
           num1 = sc.nextInt();
            sc.nextLine();//limpando o buffer
            System.out.println("Entre com o segundo numero: ");
           num2 = sc.nextInt();
            num3 = num1 / num2;

        }catch (ArithmeticException e){
            System.out.println("Houve um erro no valor do segundo numero");
            System.out.println("entre com um valor diferente de 0");
        }catch (InputMismatchException i){
            System.out.println("O tipo do dado é inteiro");
            System.out.println("Digite um valor inteiro");
        }
        finally {
            if (num3==0){
                System.out.println("Deu ruim na divisao");
            }
           else {
                System.out.println(num3);
            }
        }
        //***EXCEÇÕES PERSONALIZADAS****
        Conta c1 =  new Conta(12334,20000);
        c1.sacar(550.0);

        System.out.println("CONTINUA RODANDO");
        */
        //Funcionario
        //criando um array de funcionario
        Funcionario[]funcionarios = new Funcionario[10];

        Funcionario f1= new Funcionario("Joaquim",2000,"Producao",35);
        Funcionario f2= new Funcionario("Sergio",8000,"Arquitetura",42);
        Funcionario f3= new Funcionario("Joaquim",15000,"Engenharia",25);

        funcionarios[0]=f1;
        funcionarios[1]=f2;
        funcionarios[2]=f3;

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome: "+funcionarios[i].getNome());
            System.out.println("Idade: "+funcionarios[i].getIdade());
            System.out.println("Cargo: "+funcionarios[i].getCargo());
            System.out.println("Salario: "+funcionarios[i].getSalario());
        }
    }
}
