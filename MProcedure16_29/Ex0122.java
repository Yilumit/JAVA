package MProcedure16_29;
import javax.swing.JOptionPane;
/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Mostra dois valores inteiros em ordem crescente.
 */
public class Ex0122 {
    static int x, y;
    public static void main(String[] args) {
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Valor 1:"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Valor 2:"));
        procedureCrescente();
    }
    static void procedureCrescente(){
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

