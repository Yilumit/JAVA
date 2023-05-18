import javax.swing.JOptionPane;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe um número, Calcula e mostra os resultados da tabuada desse número
 */
public class Ex0134 {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Insira o numero que deseja realizar a tabuada:", 9));
        for (int i = 1; i <= 10; i++) {
            System.out.print(num*i+"\n");
        }
    }
}
