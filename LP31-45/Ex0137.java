import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe um número inteiro. Calcula e mostra a série de Fibonacci até o seu N’nésimo termo.
 */
public class Ex0137 {
    public static void main(String[] args) {
        int x, y, num, fib;
        num=Integer.parseInt(JOptionPane.showInputDialog("Numeros de termos da serie Fibonacci:", 4));
        x=1;
        y=0;
        for (int cont = 1; cont <= num; cont++) {
                fib=x+y;
                y=x;
                x=fib;
                System.out.print(fib+" ");
        }
    }
}
