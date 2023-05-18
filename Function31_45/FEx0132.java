package Function31_45;
import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe um número inteiro. Calcula e mostra o seu fatorial.
 */
public class FEx0132 {
    public static void main(String[] args) {
        int fat, num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: ", 5));
        fat=1;
        System.out.print("Fatorial:\n");
        for (int cont = num; cont >1; cont--) {
            
            System.out.println(fatorial(fat, cont));
            fat=fatorial(fat, cont);
        }
       
        
    }
    static int fatorial(int fat, int contador){
        fat= fat*contador;
        return fat;
    }
}
