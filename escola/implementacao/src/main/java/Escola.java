public class Escola {

    String nome;
    String endereco;
    String numTelefone;
    String email;
    //atributo
    Estudante estudantes[] = new Estudante[100];


    //construtor

    public Escola(String nome, String endereco, String numTelefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
        this.email = email;
    }


    void addEstudante(Estudante e){
        //percorrendo o array
        for (int i = 0; i < estudantes.length; i++) {
            if(estudantes[i]==null){
                estudantes[i]=e;
                break;
            }

        }
    }

    void mostrarInfos() {
        System.out.println("INFOS DA ESCOLA");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + numTelefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);

        //percorrendo o array
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                estudantes[i].mostraInfos();
            }
        }
    }

      void qtdEstudanteAno(){
            // Contadores por ano
            int primeiroAno = 0;
            int segundoAno = 0;
            int terceiroAno = 0;
            // Percorrendo o array
            for (int i = 0; i < estudantes.length; i++) {
                // Certifique-se de que a posição está cheia
                if (estudantes[i] != null) {
                    if (estudantes[i].ano.equalsIgnoreCase("Primeiro")) {
                        primeiroAno++;
                    } else if (estudantes[i].ano.equalsIgnoreCase("Segundo")) {
                        segundoAno++;
                    } else {
                        terceiroAno++;
                    }
                }
            }

            System.out.println("Quantidade de alunos por ano");
            System.out.println("1º ANO: " + primeiroAno);
            System.out.println("2º ANO: " + segundoAno);
            System.out.println("3º ANO: " + terceiroAno);
        }

    }

