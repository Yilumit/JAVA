package Instancia;
import javax.swing.JOptionPane;
/*  Classe de métodos
 *  Só as funções e procedimentos que seráo utilizados.
 *  Uma biblioteca personalizada.
 */

class Metodos {
    /*  Cadastro das estatísticas */
    public float FCadastraEstatisticas (Estatistica []estatisticas){
        float mediaAcidentes=0;
        JOptionPane.showMessageDialog(null, "Cadastro de Estatísticas");
        System.out.println("        Cadastro de Estatísticas");
        /*  Entrada das estatísticas  */
        for (int i = 0; i < estatisticas.length; i++) {
            /*  Código da cidade de índice 'i' */
            estatisticas[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: ",01+i));
            System.out.println("Código da cidade: "+estatisticas[i].CodigoCidade);

            /*  Nome da cidade de índice 'i' */
            estatisticas[i].NomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            System.out.println("Cidade: "+estatisticas[i].NomeCidade);

            /*  Quantidade de acidentes da cidade de índice 'i'  */
            estatisticas[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes na cidade:" ));
            System.out.println("Quantidade de acidentes: "+estatisticas[i].QtdAcidentes+"\n");

            /*  Média de Acidentes das 10 cidades */
            mediaAcidentes = mediaAcidentes + estatisticas[i].QtdAcidentes;// media = media + acidentes

        }
        mediaAcidentes = mediaAcidentes/estatisticas.length;
        JOptionPane.showMessageDialog(null, "Cadastro concluído!");
        return mediaAcidentes; //retorna média
    }

    /*  Consulta por quantidade de acidentes > 100 e < 500  */
    public void PQtdAcidentes(Estatistica []estatisticas){
        int consulta;
        
        do {
            consulta = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes referente a cidade que deseja consultar (maior que 100 e menor que 500): "));

            /* Se número inválido */
            if (consulta>499 || consulta<101) {
                JOptionPane.showMessageDialog(null,  "Inválido!");

            }
        } while (consulta>499 || consulta<101); //regra: nº de acidentes entre 101 e 499
        System.out.println("Cidades encontradas");

        /*  Verifica em todos cadastros */
        for (int i = 0; i < estatisticas.length; i++) {
            if (estatisticas[i].QtdAcidentes == consulta) {//nº de acidentes == consulta: Cidade encontrada

                System.out.println("Cidade: "+estatisticas[i].NomeCidade+"\nCódigo da cidade: "+estatisticas[i].CodigoCidade+"\n");
            }
        }
        System.out.println("        ***************************************");
        
    }

    /*  Consulta por estatísticas de acidentes */
    public void PMaiorMenor(Estatistica []estatisticas){
        int consulta;
        Estatistica aux = new Estatistica();// auxiliar
        do {
            consulta = Integer.parseInt(JOptionPane.showInputDialog(" Consultar por:\n1 - Menor número de acidentes\n2 - Maior número de acidentes\n9 - Cancelar consulta",1));
            switch (consulta) {

                /*  Menor número de acidentes */
                case 1:
                    /*  Bubble Sort */
                    for (int i = 0; i < estatisticas.length-1; i++) {
                        for (int j = i+1; j < estatisticas.length-i; j++) {

                            /*  Se qntd de acidentes da cidade 'i' maior que a qntd da cidade 'j' */
                            if (estatisticas[i].QtdAcidentes > estatisticas[j].QtdAcidentes) {
                                /*  Troca dos valores */
                                aux = estatisticas[j];
                                estatisticas[j] = estatisticas[i];
                                estatisticas[i] = aux;
                            }
                        }
                    }
                    break;
                /*  Maior número de acidentes */
                case 2:

                    for (int i = 0; i < estatisticas.length-1; i++) {
                        for (int j = i+1; j < estatisticas.length-i; j++) {

                            /*  Se qntd de acidentes da cidade 'i' menor que a qntd da cidade 'j' */
                            if (estatisticas[i].QtdAcidentes < estatisticas[j].QtdAcidentes) {
                                /*  Troca dos valores */
                                aux = estatisticas[j];
                                estatisticas[j] = estatisticas[i];
                                estatisticas[i] = aux;
                            }
                        }
                    }
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,  "Inválido!");
                    break;
            }
                
            
        } while (consulta < 1 || consulta > 2 && consulta != 9 );
        if (consulta!=9) {
            /*  Mostra estatísticas em ordem */
            System.out.println("        Lista Ordenada");
            for (int i = 0; i < estatisticas.length; i++) {
                System.out.println("Código: "+estatisticas[i].CodigoCidade+"\nCidade: "+estatisticas[i].NomeCidade+"\nAcidentes: "+estatisticas[i].QtdAcidentes);
            }
            System.out.println("        ***************************************");
        }
    }

    /*  Cidades com qtd de acidentes acima da média das 10 cidades  */
    public void PAcima(float media, Estatistica []estatisticas){
        JOptionPane.showMessageDialog(null,  "Média de acidentes: "+media);
        System.out.println("\nCidades com quantidade de acidentes acima da média : ");
        for (int i = 0; i < estatisticas.length; i++) {
            if (estatisticas[i].QtdAcidentes>media) {
                System.out.println("Cidade :"+estatisticas[i].NomeCidade+"\nCódigo da Cidade:"+estatisticas[i].CodigoCidade+"\nAcidentes: "+estatisticas[i].QtdAcidentes);
            }
        }

    }
}
