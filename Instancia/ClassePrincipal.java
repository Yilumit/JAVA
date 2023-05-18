package Instancia;

import javax.swing.JOptionPane;

/*  @author Vinícius da Silva Barbosa
 *  21/04/2023
 *  Objetivo (Classe Principal): 
|	MENU ESTATÍSTICA	               	        |
| Estatísticas de acidentes em 2020		        |
| 1 - Cadastro Estatística			            |
| 2 - Consulta por quantidade de acidentes	    |
| 3 - Consulta por estatísticas de acidentes	|
| 4 - Acidentes acima da média das 10 cidades   |
| 9 - Finaliza 		   		                    |
 * 
 */
public class ClassePrincipal {
    public static void main(String[] args) {
        Estatistica[] estatistica = new Estatistica[10]; // Criando uma variável personalizada
        int x;
        Metodos n = new Metodos();// Molda o objeto 'n' pela estrutura da classe 'Metodos'| vai ser usada para chamar os procedimentos e funções da classe Metodos
        float mediaAcidentes=0;

        for (int i = 0; i < estatistica.length; i++) {
            estatistica[i] = new Estatistica();// acho que estrutura cada índice a partir da classe Abstrata| this(0," ",0)
        }
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de Acidentes em 2022\n1 - Cadastro Estatística\n2 - Consulta por quantidade de acidentes\n3 - Consulta por estatísticas\n4 - Acidentes acima da média das 10 cidades\n9 - Finaliza",1));
            switch(x){
                case 1:
                    mediaAcidentes = n.FCadastraEstatisticas(estatistica);
                    break;
                case 2:
                    n.PQtdAcidentes(estatistica);// '.n' vai servir para chamar o procedimento da classe 'Metodos'
                    break;
                case 3:
                    n.PMaiorMenor(estatistica);
                    break;
                case 4:
                    n.PAcima(mediaAcidentes,estatistica);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Inválido!");
            }
        } while (x != 9);
        
    }
    
    
}
