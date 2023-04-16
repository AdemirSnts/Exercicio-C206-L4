public class Main2 {
    public static void main(String[] args) {
        //Atribuindo dados de forma estatica

        Banco bb= new Banco(); //Criando um banco
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        bb.nome="sicoob";
        bb.endereco="Casa nova";
        bb.conta=contaPoupanca;

        //cliente para usar o banco
        Cliente c = new Cliente();

        c.nome="Ademir";
        c.idade=25;


        contaPoupanca.nomeTitular=c.nome;
        bb.conta.nomeTitular= contaPoupanca.nomeTitular;
        bb.conta.saldo=5000;
        contaPoupanca.numConta= String.valueOf(23456);



        //mostrar as infos
        contaPoupanca.mostrarInfo();
        bb.mostrarInfos();
        bb.adicionaClientes(c);
        contaPoupanca.verificarSaldo();

    }
}
