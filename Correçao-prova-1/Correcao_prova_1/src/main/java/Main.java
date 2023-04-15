import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //controla a entrada de dados
        Scanner sc = new Scanner(System.in);

        //Variaveis e objetos importantes do sistema
        Estante estante = new Estante('A',1); //
        int opcao;
        boolean flag = true;
        while(flag){

            System.out.println("BEM VINDO AO SISTEMA DE CONTROLE DE LIVROS ");
            System.out.println("1 - Adicionar livros");
            System.out.println("2 - mostrar porcentagem de livros ");
            System.out.println("3 - mostrar livros com mais e menos paginas ");
            System.out.println("4 - mostrar infos dos livros da cada autor");
            System.out.println("5 - sair do sistema");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                //criando livro na main
                    Livro livro = new Livro();
                    sc.nextLine();
                    System.out.println("Titulo");
                    livro.titulo=sc.nextLine();
                    System.out.println("Genero literario");
                    livro.genLiterario= sc.nextLine();
                    System.out.println("Editora");
                    livro.editora= sc.nextLine();
                    System.out.println("Quantidade de paginas ");
                    livro.qntFolhas= sc.nextInt();
                    sc.nextLine(); // limpando o buffer

                    //Acessando e preenchendo as infos do autor
                    System.out.println("Nome do autor");
                    livro.autor.nome= sc.nextLine();
                    System.out.println("Profissão");
                    livro.autor.profissao= sc.nextLine();
                    System.out.println("Ano de nascimento");
                    livro.autor.anoNascimento=sc.nextInt();

                   //Adicionando livros a estante
                    estante.addLivros(livro);

                break;
                case 2:
                    estante.porcentagemGen();
                    break;

                case 3:
                    estante.livroMaisEMenosPag();
                    break;

                case 4:
                    estante.mostrarInfos();
                    break;
                case 5:
                    flag=false;
                 break;
            }



        }




        sc.close();
    }
}
