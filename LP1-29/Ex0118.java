/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Faz a diferença de um valor maior pelo menor.
 */
import javax.swing.JOptionPane;

public class Ex0118 {
    public static void main(String[] args) {
        int n1, n2, result;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor:"));
        if (n1>n2) {
            result = n1 - n2;
        }else{
            result=n2-n1;
        }
        System.out.print("A diferenca do maior pelo menor E: "+result);


    }
}
