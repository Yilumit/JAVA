/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Área de um quadrado
 */
import javax.swing.JOptionPane;

public class Ex0101 {
    public static void main(String args[]){
        int lado, area;//variáveis
        lado=Integer.parseInt(JOptionPane.showInputDialog("Lado do quadrado:"));//Mensagem com entrada de dados
        area=lado*lado;
        JOptionPane.showMessageDialog(null,"Area do quadrado:"+area);//Mensagem com saída de dados
    }
}
