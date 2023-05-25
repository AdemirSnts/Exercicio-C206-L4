package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando um arquivo
        Arquivo arquivos = new Arquivo();

        //criando um array de livros para mostrar as infos
        ArrayList<Livro> infosLivros;

        //Criando um menu

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        //Var para escolher a opção do usuario
        int op;

        while (flag) {
            infosLivros = arquivos.ler();

            System.out.println("---- BEM VINDO(A) AO MENU DE OPCOES DE LIVROS -----");
            System.out.println("1 - Salvar as informacoes do livro no arquivo txt");
            System.out.println("2 - Mostrar as informacoes dos livros salvos no arquivo");
            System.out.println("3 - Ordenar os livros em ordem crescente de páginas");
            System.out.println("4 - Ordenar os livros em ordem decrescente de páginas");
            System.out.println("5 - Sair do menu");
            op= sc.nextInt();
            //limpando o buffer
            sc.nextLine();

            switch (op){
                case 1:{
                    //Adicionando livros ao arquivo
                    String nome;
                    String autor;
                    String editora;
                    int qtdPaginas;

                    System.out.println("Nome do livro: ");
                    nome = sc.nextLine();
                    System.out.println("Nome do autor do livro: ");
                    autor = sc.nextLine();
                    System.out.println("Nome da editora do livro: ");
                    editora = sc.nextLine();
                    if (editora.equalsIgnoreCase("Leya")) {
                          if(editora.equalsIgnoreCase( " Arqueiro")) {
                              if(!editora.equalsIgnoreCase( " Rocco")) {
                                  try {
                                      throw new InfoInvalidaException(editora);
                                  } catch (InfoInvalidaException e) {
                                      break;
                                  }
                              }
                        }
                    }
                    System.out.println("Quantidade de paginas: ");
                    qtdPaginas = sc.nextInt();
                    if (qtdPaginas<=0){
                        try {
                            throw new InfoInvalidaException(qtdPaginas);
                        } catch (InfoInvalidaException e) {
                          break;
                        }

                    }

                    //Criando o livro
                    Livro book = new Livro(nome, autor, editora, qtdPaginas);

                    //Escrevendo as informacoes do livro no arquivo
                    arquivos.escrever(book);

                    break;
                }
                case 2:{
                    //Mostrando as informações do livro
                    for (int i = 0; i < infosLivros.size(); i++) {
                        System.out.println("Nome: "+infosLivros.get(i).getNome());
                        System.out.println("Autor: "+infosLivros.get(i).getAutor());
                        System.out.println("Editora: "+infosLivros.get(i).getEditora());
                        System.out.println("Quantidade de páginas: "+infosLivros.get(i).getQtdPaginas());
                    }
                    break;
                }
                case 3:{
                    System.out.println("****ORDENADA EM ORDEM CRESCENTE PELA QUANTIDADE DE PÁGINAS****");
                    Collections.sort(infosLivros);
                    for (int i = 0; i < infosLivros.size(); i++) {
                        System.out.println("Nome: "+infosLivros.get(i).getNome());
                        System.out.println("Autor: "+infosLivros.get(i).getAutor());
                        System.out.println("Editora: "+infosLivros.get(i).getEditora());
                        System.out.println("Quantidade de páginas: "+infosLivros.get(i).getQtdPaginas());
                    }

                    break;
                }
                case 4:{
                    System.out.println("****ORDENADA EM ORDEM DECRESCENTE PELA QUANTIDADE DE PÁGINAS****");
                    Collections.reverse(infosLivros);
                    for (int i = 0; i < infosLivros.size(); i++) {
                        System.out.println("Nome: "+infosLivros.get(i).getNome());
                        System.out.println("Autor: "+infosLivros.get(i).getAutor());
                        System.out.println("Editora: "+infosLivros.get(i).getEditora());
                        System.out.println("Quantidade de páginas: "+infosLivros.get(i).getQtdPaginas());
                    }

                    break;
                }

                case 5:{
                    flag=false;
                    break;
                }
            }

        }
        sc.close();

    }
}