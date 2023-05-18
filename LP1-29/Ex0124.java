import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Verifica se um valor inteiro é divisível por 2 e 3
 */
public class Ex0124 {
    public static void main(String[] args) {
        int num, divi2, divi3;
        num=Integer.parseInt(JOptionPane.showInputDialog("Insira um número:",30));
        divi2=num%2;
        divi3=num%3;
        /*Verificação do resto */
        if (divi2==0) {
            JOptionPane.showMessageDialog(null,"Divisivel por 2");
        } else {
            JOptionPane.showMessageDialog(null,"Nao divisivel por 2");
        }
        if (divi3==0) {
            JOptionPane.showMessageDialog(null,"Divisivel por 3");
        } else {
            JOptionPane.showMessageDialog(null,"Nao divisivel por 2");
        }
    }
}
