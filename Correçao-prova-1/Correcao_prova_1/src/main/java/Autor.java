public class Autor {
    String nome;
    int anoNascimento;
    String profissao;

    void mostrarInfos(){
        System.out.println("----Infos do autor------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Ano de nascimento: "+this.anoNascimento);
        System.out.println("Profissão: "+this.profissao);
    }
}
