public class Estante {
    //Atributos explicitos
    int idEstante; //Id da estante
    char letra; //letra que identifica a estante
    //Atributos implicitos
    Livro []livros = new Livro[120]; //Array de livros do Moises

    //construtor classe estante
    public  Estante(char letra, int idEstante){
        this.letra = letra;
        this.idEstante = idEstante;
    }

    //Métodos da estante
      //1. Método para adicionar livros na estante
    void addLivros(Livro livro){
        //Percorrendo um array de livros
        for (int i = 0; i < livros.length ; i++) {
            //Verificação de a posição está vazia
            if (livros[i] == null) {
                livros[i]=livro;
                break; //Para adicionar somente um livro em cada posição
            }
        }

    }
    //2.Método para calcular os generos literarios
    void porcentagemGen(){
        //Variaveis locais para contagem da qtd de livro de cada genero
        int contaDrama=0; //Variavel de contagem de livros de drama
        int contaSuspense=0; //Variavel de contagem de livros de suspense
        int contaOutros=0; //Variavel de contagem de outros livros
        int qtdLivrosEstante=0; //Armazena a quantidade de livros a estante

        //Percorrer o array de livros
        for (int i = 0; i < livros.length; i++) {
            //Verificando se existe um livro na posição i
            if (livros[i] != null) {

                if (livros[i].genLiterario.equalsIgnoreCase("Drama"))//comparação de string
                    contaDrama++;
                if (livros[i].genLiterario.equalsIgnoreCase("Suspense"))//comparação de string
                    contaSuspense++;
                else
                    contaOutros++;

                qtdLivrosEstante++;
            }
        }
        //Apresentando as informações relativas a porcentagemde livros da estante
        System.out.println("Porcentagem de livro de cada genero");
        System.out.println("Drama: "+((double)contaDrama/qtdLivrosEstante)*100);
        System.out.println("Suspense: "+((double)contaSuspense/qtdLivrosEstante)*100);
        System.out.println("Outros: "+((double)contaOutros/qtdLivrosEstante)*100);
    }
    //3.Método para contar a quantidade de páginas
    void livroMaisEMenosPag(){
        //Variaveis locais para controle de fluxo
        int maiorNumPags=-1; //Armazena maior numero de paginas
        int menorNumPags=999; //Armazena menor numero de paginas
        int posMaior=0;
        int posMenor=0;
        for (int i = 0; i < livros.length ; i++) {
            if (livros[i] != null) {
                if (livros[i].qntFolhas >maiorNumPags) {
                    posMaior=i;
                    maiorNumPags=livros[i].qntFolhas;
                }
                if (livros[i].qntFolhas<menorNumPags) {
                    posMenor=i;
                    menorNumPags=livros[i].qntFolhas;
                }

            }

        }
        //Mostrando asa informações
        if (posMaior==0 && posMenor==0){
            System.out.println("Não há informações de livros");
        }else {
            //Apresentando as informações dos livros
            System.out.println("livros mais páginas");
            livros[posMaior].mostrarInfos();
            System.out.println("Livro menos páginas");
            livros[posMenor].mostrarInfos();
        }

    }
    //4.Método para apresentar
    void mostrarInfos(){
        System.out.println("Letra: "+letra);
        System.out.println("ID: "+idEstante);
        System.out.println(" INFOS DO LIVRO ");
        for (int i = 0; i < livros.length ; i++) {
            if (livros[i]!=null){
                livros[i].mostrarInfos();
            }
        }

    }
}
