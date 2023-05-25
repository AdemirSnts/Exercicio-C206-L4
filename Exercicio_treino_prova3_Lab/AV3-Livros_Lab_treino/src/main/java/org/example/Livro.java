package org.example;

public class Livro implements Comparable<Livro>{
    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas;

    //Construtor
    public Livro(String nome, String autor, String editora, int qtdPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.qtdPaginas = qtdPaginas;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void mostrarInfos(){


    }

    @Override
    public int compareTo(Livro livro) {

        return Integer.compare(livro.getQtdPaginas(), this.qtdPaginas);
    }
}
