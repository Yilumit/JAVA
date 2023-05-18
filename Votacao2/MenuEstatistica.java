package Votacao2;

import javax.swing.JOptionPane;
/*
 * ......................................................       
 * .    MENU ESTATÍSTICA                                .       
 * ......................................................       
 * . 1 - Vencedor                                       .                                
 * . 2 - Segundo colocado                               .        
 * . 3 - Quantidade de votos em branco                   .       
 * . 4 - Quantidade de votos nulos                      .       
 * . 5 - Mostra eleitores                               .
 * . 6 - Mostra apuração                               .
 * . 9 - FIM                                            .
 * ......................................................---------
 * 
 */

public class MenuEstatistica {
  

    void Menu(Votacao cadVotacao[], Eleitor cadEleitor[]){
        int menu;
        String Segundo = " ";
        MetodosVotacao chamaMetodos = new MetodosVotacao();// Utilizada para chamar os procedimentos e funções da classe 'MetodosVotacao'

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu de Estatistica\n1 - Vencedor\n2 - Segundo Colocado\n3 - Quantidade de votos em branco\n4 - Quantidade de votos nulos\n5 - Mostra Eleitores\n6 - Mostra apuração\n9 - Finaliza",1));
            switch (menu) {
                /*  Vencedor*/
                case 1:
                    Segundo = chamaMetodos.Vencedor(cadVotacao);
                    break;
                case 2:
                /*  Segundo Colocado */                    
                    JOptionPane.showMessageDialog(null, "Segundo Colocado: "+Segundo);//Não é o melhor jeito mas to com preguiça de fazer um decente
                    break;
                /*  Quantidade de votos eem branco */
                case 3:
                    JOptionPane.showMessageDialog(null, "Quantidade de votos em branco: "+chamaMetodos.QuantidadeVotos(cadVotacao, 3)); //3 = código do Branco
                    break;
                /*  Quantidade de votos nulos */
                case 4:
                    JOptionPane.showMessageDialog(null, "Quantidade de votos nulo: "+chamaMetodos.QuantidadeVotos(cadVotacao, 4)); //4 = código do Nulo
                    break;
                /*  Mostra Eleitores */
                case 5:
                    chamaMetodos.MostraEleitores(cadEleitor);
                    break;
                case 6:
                    chamaMetodos.MostraApuracao(cadVotacao);
                    break;
                case 9:
                    System.exit(0);
                    break; 
            
                default:
                    JOptionPane.showMessageDialog(null,  "Inválido!");
                    break;
            }
        } while (menu != 9);
    }
}
