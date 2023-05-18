import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Recebe 2 números inteiros e mostra a soma dos quadrados
 */
public class Ex0109 {
    public static void main(String args[]){
        int n1, n2;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Número: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Outro número: "));
        double n3=(Math.pow(n1,2))+(Math.pow(n2,2));
        JOptionPane.showMessageDialog(null, "Soma dos quadrados: "+n3);
    }
    
}
