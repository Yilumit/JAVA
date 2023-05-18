package Votacao2;
/*
 * ......................................................
 *                MENU PRINCIPAL                   
 * ......................................................   
 * . 1 - Cadastra Eleitor                          
 * . 2 - Cadastra Votação 1 e 2                    
 * . 3 - Agrupa  Apuração                            
 * . 4 - Menu  Estatística                             
 * . 9 - FIM                                            
 * .......................................................
 * .......................................................
 *              Cadastro Votação 1,2      
 * .......................................................
 *  1 - Cadastro Votação 1                         
 *  2 - Cadastro votação 2         
 *  9 - FIM                                    
 *  ......................................................
 */
import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static void main(String[] args) {
        int menu, votacao;

        Eleitor cadEleitor[] = new Eleitor [10];// Declaração do vetor como um objeto da Classe 'Eleitor'
        Votacao cadVotacao[] = new Votacao [10];//      ""          ""          ""         ""   'Votacao'
        

        MetodosVotacao chamaMetodos = new MetodosVotacao();// Utilizada para chamar os procedimentos e funções da classe 'MetodosVotacao'
        MenuEstatistica estatistica = new MenuEstatistica();// Usada para chamar a classe 'MenuEstatistica'
        
        /*  Configuração de cada índice do vetor a partir da classe 'Eleitor' e 'Votacao'  */
        for (int i = 0; i < cadEleitor.length; i++) {

            cadEleitor[i] = new Eleitor(); //this(0," ",0)
            cadVotacao[i] = new Votacao(); //this(0, 0, 0)
        }
        

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu de Votação\n1 - Cadastro de Eleitor\n2 - Cadastro de Votação 1 e 2\n3 - Agrupa Apuração\n4 - Menu Estatística\n9 - Finaliza",1));
            switch (menu) {
                /*  Cadastro Eleitor */
                case 1:
                    chamaMetodos.CadastroEleitor(cadEleitor);
                    break;
                case 2:
                    /*  Menu de Cadastro de Votação */
                    do {
                        votacao = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Votação\n1 - Cadastro Votação 1\n2 - Cadastro Votação 2\n9 - Finalizar", 1));
                        switch (votacao) {
                            case 1:
                                chamaMetodos.CadastroVotacao1( cadEleitor);
                                break;
                            case 2:
                                chamaMetodos.CadastroVotacao2( cadEleitor);
                                break;
                            case 9:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,  "Inválido!");
                                break;
                        }
                    } while (votacao != 9);
                    
                    break;
                /*  Agrupa Apuração */
                case 3:
                    chamaMetodos.AgrupaApuracao(cadVotacao);
                    break;
                /*  Menu Estatística */
                case 4:
                    estatistica.Menu(cadVotacao, cadEleitor
                    );
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
