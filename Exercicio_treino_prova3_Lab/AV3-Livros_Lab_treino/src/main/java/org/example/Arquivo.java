package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Livro livro){
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        try {
            // Recebe o nome do meu arquivo
            os = new FileOutputStream("Livro.txt",true);

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Efetivamente escrevendo no arquivo
            bw.write("++ LIVROS ++\n");
            bw.write(livro.getNome()+"\n");
            bw.write(livro.getAutor()+"\n");
            bw.write(livro.getEditora()+"\n");
            bw.write(livro.getQtdPaginas()+"\n");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public ArrayList<Livro> ler(){

        //criando um array list que armazena os livros encontrados no arquivo
        ArrayList<Livro> acheiLivro = new ArrayList<>();
        // Estruturas que servirão para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para ler o arquivo

        try{
            is = new FileInputStream("Livro.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while(linhaLer!=null){
                // Verificando se já estamos na estrutura de um funcionário
                if(linhaLer.contains("++ LIVROS ++")){

                    // Preenchendo as informações do livro
                    String nome = br.readLine();
                    String autor = br.readLine();
                    String editora = br.readLine();
                    int qtdPaginas = Integer.parseInt(br.readLine());

                    // Criando um objeto auxiliar de livro

                    Livro auxLivro = new Livro(nome,autor,editora,qtdPaginas);

                    // Adicionando o livro ao arrayList, para informar que encontrei o livro
                    acheiLivro.add(auxLivro);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        }catch (Exception e){

        }
        return acheiLivro;
   }
}
