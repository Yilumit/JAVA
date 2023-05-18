import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe um número inteiro. Calcula e mostra o seu fatorial.
 */
public class Ex0132 {
    public static void main(String[] args) {
        int fat, num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: ", 5));
        fat=num;
        System.out.print("Fatorial:\n");
        for (int cont = 1; cont < num; cont++) {
            fat=fat*cont;
            System.out.println(fat+" ");
        }
    }
}
