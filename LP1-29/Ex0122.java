import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Mostra dois valores inteiros em ordem crescente.
 */
public class Ex0122 {
    public static void main(String[] args) {
        int x, y;
        x=Integer.parseInt(JOptionPane.showInputDialog("Valor 1:"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Valor 2:"));
        if (x>y) {
            System.out.println(y+" "+x);
        } else {
            if (y>x) {
                System.out.println(x+" "+y);
            } else {
                System.out.println("Os numeros são iguais!");
            }
        }
    }
}
