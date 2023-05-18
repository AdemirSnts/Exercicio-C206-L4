package br.inatel.aula13Teorica.Exercicio.exception;

import java.util.HashSet;
import java.util.Set;

public class Conta {
    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente (Cliente cliente){

        clientes.add(cliente);
    }
    public void sacar(double limite){
        //Tratamento do erro
        try{
            //verifica se o valor de saldo é menor do que o valor do saque
            if (limite>this.saldo){
                throw new SaldoInsuficienteException(this.saldo,limite);
            }else {
                this.saldo-=limite;
                System.out.println("Novo saldo: "+this.saldo+ " R$");
            }
        }catch (SaldoInsuficienteException s){
            System.out.println(s);
        }
    }

    public void mostraInfos(){
        for (Cliente infos: clientes) {
            try {
                System.out.println("Nome: "+infos.getNome());
                System.out.println("CPF: "+infos.getCpf());

            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
