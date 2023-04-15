public class Livro {
    //Atributos do livro - explícito
    String titulo; //titulo do livro
    String genLiterario; //genero do livro
    String editora; //Editora do livro
    int qntFolhas;

    //Atributos do livro - implicito
    Autor autor; //Referência para o meu autor

    //Construtor da classe livro

    public Livro() {
        this.autor = new Autor(); //Finalizada a composição
    }

    //Métodos da classe de livros
    void mostrarInfos(){
        System.out.println("---- Infos do livro -----");
        System.out.println("Titulo: "+titulo);
        System.out.println("Editora: "+editora);
        System.out.println("Genero literario: "+genLiterario);
        System.out.println("Quantidade de folhas: "+qntFolhas);

        //Mostrando as informações do autor
        autor.mostrarInfos();
    }
}
