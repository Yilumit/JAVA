import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Recebe 2 números reais e calcula a diferença entre eles
 */
public class Ex0110 {
    public static void main(String[] args) {
        double n1, n2, n3;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Número: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Outro número: "));
        n3=n1-n2;
        JOptionPane.showMessageDialog(null,"A diferença entre os números é igual a: "+n3);
    }
}
