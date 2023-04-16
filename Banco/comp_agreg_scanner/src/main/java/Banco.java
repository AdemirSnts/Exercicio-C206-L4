public class Banco {

    String nome;
   String endereco;
   /*
   Associações
   Agregação: parte faz sentido existir
   composição: parte não faz sentido existir
    */

    //Agregando a classe de cliente
    Cliente cliente;
    ContaPoupanca conta;

    public Banco(){

        cliente= new Cliente(); //Composição
    }

    //metodos
    void mostrarInfos(){
        System.out.println("Nome do banco: "+this.nome);
        System.out.println("Endereço do banco: "+this.endereco);
    }

    void adicionaClientes(Cliente c){

        System.out.println("Cliente foi adicionado");
    }
}
