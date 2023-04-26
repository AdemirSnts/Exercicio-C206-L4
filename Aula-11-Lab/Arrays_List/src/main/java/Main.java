import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

   /*
        //Hash map - Trabalha com o conceito de chave valor
        //chave: valor
        HashMap<String, Integer> idadesAlunos = new HashMap();
        //adicionar dados
        idadesAlunos.put("Ramon",22);
        idadesAlunos.put("Artur",24);

        //imprimir os valores - Forma I
        //System.out.println(idadesAlunos);

        //Removendo os valores
        idadesAlunos.remove("Ramon");

        //imprimir os valores - Forma II
        idadesAlunos.forEach((Key,value)->{
            System.out.println("Chave: "+Key+ " Valor: "+value);
        });

        //Hash set - Não aceita valores duplicados
        HashSet<Integer> idades = new HashSet();

        //adicionando os itens na estrutura
        idades.add(2);
        idades.add(5);
        idades.add(6);
        idades.add(4);
        idades.add(3);
        idades.add(2);

        //mostrando os valores
        System.out.println(idades);

        //Será usado nas aulas de lab
        //Array List - é uma estrutura dinâmica
        ArrayList listaHeterogenea = new ArrayList(); //heterogenea
        ArrayList <Integer> listaDeInteiros = new ArrayList();

        //Adicionando itens a minha estrutura
        listaHeterogenea.add(2);
        listaHeterogenea.add(true);
        listaHeterogenea.add("Ademir");
        listaHeterogenea.add('A');

        //Imprmindo itens - Forma I
        System.out.println(listaHeterogenea);

        //Imprimindo itens forma II
        for(int i=0; i< listaHeterogenea.size();i++){
            System.out.println("DADOS: "+listaHeterogenea.get(i));
        }

        listaDeInteiros.add(3);
        listaDeInteiros.add(1);
        listaDeInteiros.add(9);
        listaDeInteiros.add(7);
        listaDeInteiros.add(6);
        listaDeInteiros.add(4);
        //Imprimindo itens forma II
        System.out.println("LISTA ANTES DE ORDENADA");
        for(int i=0; i< listaDeInteiros.size();i++){

            System.out.println("DADOS: "+listaDeInteiros.get(i));
        }
        System.out.println("ORDENADA EM ORDEM CRESCENTE");
        Collections.sort(listaDeInteiros);
        for(int i=0; i< listaDeInteiros.size();i++){

            System.out.println("DADOS: "+listaDeInteiros.get(i));
        }
        //System.out.println("ORDENADA EM ORDEM DECRESCENTE");
        //Collections.reverse(listaDeInteiros);
*/
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario func1 = new Funcionario("Ademir",25,10000f);
        Funcionario func2 = new Funcionario("joão",21,4000f);
        Funcionario func3 = new Funcionario("wesley",24,30000f);

        funcionarios.add(func2);
        funcionarios.add(func3);
        funcionarios.add(func1);
        System.out.println("----ANTES DE ORDENAR----");
        for (int i = 0; i < funcionarios.size() ; i++) {
            System.out.println("NOME: "+funcionarios.get(i).getNome()+ " IDADE: "+funcionarios.get(i).getIdade()+ " SALARIO: "+funcionarios.get(i).getSalario());

        }
        System.out.println();
        Collections.sort(funcionarios);
        System.out.println("-----DEPOIS DE ORDENAR EM ORDEM CRESCENTE-----");
        for (int i = 0; i < funcionarios.size() ; i++) {
            System.out.println("NOME: "+funcionarios.get(i).getNome()+ " IDADE: "+funcionarios.get(i).getIdade()+ " SALARIO: "+funcionarios.get(i).getSalario());

        }
        System.out.println();
        Collections.reverse(funcionarios);
        System.out.println("-----DEPOIS DE ORDENAR EM ORDEM DECRESCENTE-----");
        for (int i = 0; i < funcionarios.size() ; i++) {
            System.out.println("NOME: "+funcionarios.get(i).getNome()+ " IDADE: "+funcionarios.get(i).getIdade()+ " SALARIO: "+funcionarios.get(i).getSalario());

        }
    }
}
