package MProcedure16_29;
import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Verifica se o maior número é divisível pelo menor
 */
public class Ex0126 {
    static  float x, y, resto;
    public static void main(String[] args) {

        x=Float.parseFloat(JOptionPane.showInputDialog("Digite um numero: ", 3 ));
        y=Float.parseFloat(JOptionPane.showInputDialog("Digite outro numero: ", 6 ));
        verificaDivisao();
    }
    static void verificaDivisao(){
        if (x>y) {//Verifica qual o maior
            resto=x%y;
            if (resto==0) {
                System.out.print(x+" é multiplo de "+y);
            } else {
                System.out.print(x+" nao e multiplo de "+y);
            }
        } else {
            resto=y%x;
            if (resto==0) {
                System.out.print(y+" é multiplo de "+x);
            } else {
                System.out.print(y+" nao e multiplo de "+x);
            }

        }
    }
}

