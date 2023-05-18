package Votacao2;

import java.util.Random;
import javax.swing.JOptionPane;
/*
 *  Classe de Métodos utilizados no programa Votação
 * 
 *  !Métodos e Funções meia boca!
 */

public class MetodosVotacao {
    static int num_eleitores[] = new int [10];// números dos eleitores registrados 
    static int validaSecao[] = {1, 3, 5, 6, 9, 10}; // seções de votação
    static int votoscandidato[] = new int [4]; //contador dos votos 
    static int candidatos[] = {1, 2, 3, 4}; //números de candidatos que podem ser escolhidos
    static String nomeCadidatos[] = {"Jose", "Maria", "Branco", "Nulo"};

    
    Votacao votacao1[] = new Votacao [5];
    Votacao votacao2[] = new Votacao [5];

    public int CadastroEleitor(Eleitor cadEleitor[]){
        Random numRandom = new Random();
        
        for (int i = 0; i < cadEleitor.length; i++) {
            cadEleitor[i].numEleitor   = numRandom.nextInt(200)+1;
            num_eleitores[i] = cadEleitor[i].numEleitor;
            cadEleitor[i].nomeEleitor  = JOptionPane.showInputDialog("Nome do Eleitor: ", "Alguem " );
            /*if(i<5){
                cadEleitor[i].secao    =   validaSecao[numRandom.nextInt(3)];
            } else {
                cadEleitor[i].secao    =   validaSecao[numRandom.nextInt(3) + 3];
            }*/

            System.out.println("Cadastro de Eleitor\nNome: "+cadEleitor[i].nomeEleitor+"\nNúmero do Eleitor: "+cadEleitor[i].numEleitor/*+"\nSeção do Eleitor: "+cadEleitor[i].secao*/+"\n");

        }
        System.out.println("***********************************");
        JOptionPane.showMessageDialog(null,  "Cadastro Finalizado!");
        return 0;

    }
    void CadastroVotacao1(Eleitor cadEleitor[]){
        
        JOptionPane.showMessageDialog(null,  "Cadastro de Votação 1:");
        /*  Cadastro */
        for (int i = 0; i < votacao1.length; i++) {
            boolean aux = false;
            int eleitor = 0;
            votacao1[i] =new Votacao();

            /*  Estrutura para a inserção do número de Eleitor  */
            do {
                System.out.println("números de eleitores:");
                for (int j = 0; j < num_eleitores.length; j++) {
                    System.out.print(num_eleitores[j]+" ");
                }
                votacao1[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu número de Eleitor: "));

                /*  Validação do número de Eleitor cadastrado */
                for (int j = 0; j < cadEleitor.length; j++) {
                    if (votacao1[i].numEleitor == cadEleitor[j].numEleitor) { // se o número inserido for encontrado nos números de Eleitores cadastrados
                        aux = true;                                           // aux = true e sai do loop 
                        eleitor = j; //Será usado para localizar o nome do eleitor mais adiante 
                        break;
                    }
                }
                if (aux == false) { // se número não encontrado
                    JOptionPane.showMessageDialog(null, "Número não cadastrado!");
                }
            } while (aux == false);
            
            /*  Entrada do candidato */
            aux = false;
            do {
                votacao1[i].codCandidato = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do candidato: \n1 - José\n2 - Maria\n3 - Branco \n4 - Nulo"));

                /*  Validação do candidato inserido */
                for (int j = 0; j < candidatos.length; j++) {
                    if (votacao1[i].codCandidato == candidatos[j]) {// se o número inserido for encontrado nos números de candidatos possíveis
                        aux = true;
                        break;
                    }
                }
                if (aux == false) {
                    JOptionPane.showMessageDialog(null, "Candidato Inválido!");
                }
            } while (aux == false);

            /*  Entrada da Seção */
            aux = false;
            do {
                System.out.println("\nSeções: 01, 03, 05");
                votacao1[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da seção: "));

                /*  Validação da seção de Votação 1 */
                for (int j = 0; j < validaSecao.length - 3; j++) { // somente os 3 primeiros índices fazem parte da Votação 1
                    if (votacao1[i].secao == validaSecao[j]) { // se a seção inserida for umas das contidas no vetor 'validaSeção'
                        aux = true;
                        break;
                    }
                }
                // Se a seção inserida não for igual a nenhuma das seções válidas para Votação 1
                if (aux==false) {
                    JOptionPane.showMessageDialog(null,"Seção inválida!");
                }

            } while (aux == false);
            cadEleitor[eleitor].secao = votacao1[i].secao; //atribui a seção ao cadastro do Eleitor

            /*  Mostrar votação */
            String nomeC;
            switch (votacao1[i].codCandidato) {
                case 1:
                    nomeC = "Joao";
                    break;
                case 2:
                    nomeC = "Maria";
                    break;
                case 3:
                    nomeC = "Branco";
                    break;
                default:
                    nomeC = "Nulo";
                    break;
            }
            System.out.println("Número de Eleitor: "+votacao1[i].numEleitor+" - "+cadEleitor[eleitor].nomeEleitor+"\nSeção: "+votacao1[i].secao+"\nCadidato: "+nomeC+"\n");
            
        }
        /*  Ordenação dos votos por código dos candidatos   */
        int auxOrdenar;
        for (int j = 0; j < votacao1.length-1; j++) {// a quantidade de vezes que o programa percorrerá o vetor é = número de índices do vetor menos 1 

            for (int j2 = 0; j2 < votacao1.length-1-j; j2++) {// cada vez que o vetor for percorrido, o maior valor encontrado fica fixo na última posição  
                                                            // Por isso '-j' para limitar o número de comparações já que é sabido que o maior está na última posição
                if (votacao1[j2].codCandidato>votacao1[j2+1].codCandidato) {
                    auxOrdenar  =   votacao1[j2].codCandidato;
                    votacao1[j2].codCandidato   = votacao1[j2+1].codCandidato;
                    votacao1[j2+1].codCandidato = auxOrdenar;
                }

            }
            
        }
        System.out.println("*****************************************");
        JOptionPane.showMessageDialog(null,"Cadastro Finalizado!");

    }
    void CadastroVotacao2( Eleitor cadEleitor[]){
        
        

        JOptionPane.showMessageDialog(null,  "Cadastro de Votação 2:");
        /*  Cadastro */
        for (int i = 0; i < votacao2.length; i++) {
            boolean aux = false;
            int eleitor = 0;
            votacao2[i] =new Votacao();

            /*  Estrutura para a inserção do número de Eleitor  */
            do {
                System.out.println("números de eleitores:");
                for (int j = 0; j < num_eleitores.length; j++) {
                    System.out.print(num_eleitores[j]+" ");
                }
                
                votacao2[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu número de Eleitor: "));

                /*  Validação do número de Eleitor cadastrado */
                for (int j = 0; j < cadEleitor.length; j++) {
                    if (votacao2[i].numEleitor == cadEleitor[j].numEleitor) { // se o número inserido for encontrado nos números de Eleitores cadastrados
                        aux = true;                                           // aux = true e sai do loop 
                        eleitor = j; //Será usado para localizar o nome do eleitor mais adiante 
                        break;
                    }
                }
                if (aux == false) { // se número não encontrado
                    JOptionPane.showMessageDialog(null, "Número não cadastrado!");
                }
            } while (aux == false);
            
            /*  Entrada do candidato */
            aux = false;
            do {
                votacao2[i].codCandidato = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do candidato: \n1 - José\n2 - Maria\n3 - Branco \n4 - Nulo"));

                /*  Validação do candidato inserido */
                for (int j = 0; j < candidatos.length; j++) {
                    if (votacao2[i].codCandidato == candidatos[j]) {// se o número inserido for encontrado nos números de candidatos possíveis
                        aux = true;
                        break;
                    }
                }
                if (aux == false) {
                    JOptionPane.showMessageDialog(null, "Candidato Inválido!");
                }
            } while (aux == false);

            /*  Entrada da Seção */
            aux = false;
            do {

                System.out.println("Seções: 06, 09, 10");
                votacao2[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da seção: "));

                /*  Validação da seção de Votação 1 */
                for (int j = 3; j < validaSecao.length; j++) { // somente os 3 últimos índices fazem parte da Votação 2
                    if (votacao2[i].secao == validaSecao[j]) { // se a seção inserida for umas das contidas no vetor 'validaSeção'
                        aux = true;
                        break;
                    }
                }
                // Se a seção inserida não for igual a nenhuma das seções válidas para Votação 2
                if (aux==false) {
                    JOptionPane.showMessageDialog(null,"Seção inválida!");
                }

            } while (aux == false);
            cadEleitor[eleitor].secao = votacao2[i].secao; //atribui a seção ao cadastro do Eleitor

                        /*  Mostrar votação */
            String nomeC;
            switch (votacao2[i].codCandidato) {
                case 1:
                    nomeC = "Jose";
                    break;
                case 2:
                    nomeC = "Maria";
                    break;
                case 3:
                    nomeC = "Branco";
                    break;
                default:
                    nomeC = "Nulo";
                    break;
            }
            System.out.println("Número de Eleitor: "+votacao2[i].numEleitor+" - "+cadEleitor[eleitor].nomeEleitor+"\nSeção: "+votacao2[i].secao+"\nCadidato: "+nomeC+"\n");
           
        }
                /*  Ordenação dos votos por código dos candidatos   */
        int auxOrdenar;
        for (int j = 0; j < votacao2.length-1; j++) {// a quantidade de vezes que o programa percorrerá o vetor é = número de índices do vetor menos 1 

            for (int j2 = 0; j2 < votacao2.length-1-j; j2++) {// cada vez que o vetor for percorrido, o maior valor encontrado fica fixo na última posição  
                                                            // Por isso '-j' para limitar o número de comparações já que é sabido que o maior está na última posição
                if (votacao2[j2].codCandidato>votacao2[j2+1].codCandidato) {
                    auxOrdenar  =   votacao2[j2].codCandidato;
                    votacao2[j2].codCandidato   = votacao2[j2+1].codCandidato;
                    votacao2[j2+1].codCandidato = auxOrdenar;
                }

            }
            
        }
        System.out.println("*****************************************");
        JOptionPane.showMessageDialog(null,"Cadastro Finalizado!");
    }
    /*  Agrupa as duas votações */
    void AgrupaApuracao(Votacao cadVotacao[]){
        //int cont1=0, cont2=0, indicevot=0;
        /*  Tentativa de concateenar as votações já em ordem de código do candidato *///Não dá certo
        /*while ((cont1 + cont2)<= cadVotacao.length) {
            if (votacao1[cont1].codCandidato <= votacao2[cont2].codCandidato) {

                cadVotacao[indicevot].numEleitor = votacao1[cont1].numEleitor;
                cadVotacao[indicevot].codCandidato = votacao1[cont1].codCandidato;
                cadVotacao[indicevot].secao = votacao1[cont1].secao;

                cont1 += 1; //adiciona +1 a cont1 |cont = cont +1
                indicevot += 1;
            } else {
                cadVotacao[indicevot].numEleitor = votacao2[cont2].numEleitor;
                cadVotacao[indicevot].codCandidato = votacao2[cont2].codCandidato;
                cadVotacao[indicevot].secao = votacao2[cont2].secao;

                cont2 += 1;
                indicevot += 1;
            }
        }*/
        /* Desisti e fiz assim :/  */
        for (int i = 0; i < votacao1.length; i++) {
            cadVotacao[i].numEleitor = votacao1[i].numEleitor;
            cadVotacao[i].codCandidato = votacao1[i].codCandidato;
            cadVotacao[i].secao = votacao1[i].secao;
        }
        for (int i = 0; i < votacao2.length; i++) {
            cadVotacao[i+5].numEleitor = votacao2[i].numEleitor;
            cadVotacao[i+5].codCandidato = votacao2[i].codCandidato;
            cadVotacao[i+5].secao = votacao2[i].secao;
        }
         /*  Ordenação dos votos por código dos candidatos   */
         int auxOrdenar;
         for (int i = 0; i < cadVotacao.length-1; i++) {// a quantidade de vezes que o programa percorrerá o vetor é = número de índices do vetor menos 1 
 
             for (int j = 0; j < votacao1.length-1-i; j++) {// cada vez que o vetor for percorrido, o maior valor encontrado fica fixo na última posição  
                                                             // Por isso '-i' para limitar o número de comparações já que o maior está na última posição
                 if (votacao1[j].codCandidato>votacao1[j+1].codCandidato) {
                     auxOrdenar  =   votacao1[j].codCandidato;
                     votacao1[j].codCandidato   = votacao1[j+1].codCandidato;
                     votacao1[j+1].codCandidato = auxOrdenar;
                 }
 
             }
             
         }

            JOptionPane.showMessageDialog(null, "Finalizado!");
    }
    /*  Função que calcula a quantidade dee votos de cada candidato, brancos e nulos */
    String Vencedor(Votacao cadVotacao[]){ //Retorna o Segundo Colocado

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < cadVotacao.length; j++) {
                if (cadVotacao[j].codCandidato == i+1) {
                    votoscandidato[i] += 1;
                }
            } 
        }
        if (votoscandidato[0] > votoscandidato[1]) {
            JOptionPane.showMessageDialog(null, "Vencedor: Jose!");
            return "Maria"; //Segundo colocado
        } else if(votoscandidato[0] == votoscandidato[1]) {
            JOptionPane.showMessageDialog(null, "Empate!");
            return "Empate";//Segundo colocado
        } else {
            JOptionPane.showMessageDialog(null, "Vencedor: Maria!");
            return "Jose";//Segundo colocado
        }
        
    }
    /*  Função que faz a contagem de votos de um candidato específico  e retorna a quantidade de votos*/
    int QuantidadeVotos(Votacao cadVotacao[], int codigo){ //'codigo' recebido referente ao eleitor
        int votos=0;

        for (int i = 0; i < cadVotacao.length; i++) { // Percorre o vetor
            if (cadVotacao[i].codCandidato == codigo) { //  Se encontrar o código do candidato
                votos += 1; //votos = votos + 1
            }
        } 
        return votos;
    }
    /*  Procedimento que mostra os eleitores */
    void MostraEleitores(Eleitor cadEleitor[]){ /* Recebe o cadastro dos eleitores */

        for (int i = 0; i < cadEleitor.length; i++) {
            System.out.println("Eleitor: "+cadEleitor[i].nomeEleitor+"\nNúmero: "+cadEleitor[i].numEleitor+"\nSeção votada: "+cadEleitor[i].secao+"\n");
        }
        System.out.println("**********************************");
    }
    /*  Apuração dos votos */
    void MostraApuracao(Votacao cadVotacao[]){

        for (int i = 0; i < nomeCadidatos.length; i++) {
            JOptionPane.showMessageDialog(null, (i+1)+" - "+nomeCadidatos[i]+"  "+votoscandidato[i]+" Votos");
            System.out.println((i+1)+" - "+nomeCadidatos[i]+"  "+votoscandidato[i]+" Votos\n");
        }
        System.out.println("**********************************");

    }
    
}