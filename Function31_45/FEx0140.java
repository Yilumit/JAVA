package Function31_45;
import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe 2 números inteiros, verifica e mostra todos os números primos existentes entre eles.
 */
public class FEx0140 {
    public static void main(String[] args) {
        int num1, num2, retorno;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:", 11));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero:", 3));
        if (num1<num2) {
            for (int i = num1; i <= num2; i++) {//verifica do menor número até o maior
                retorno=Primos(i);
                if (retorno==2) {
                    System.out.print(i+" ");
                }
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                retorno=Primos(i);
                if (retorno==2) {
                    System.out.print(i+" ");
                }
            }
        }  
    }
    static int Primos(int menor){
        int j;
            int primo=0;
            for (j = 1; j <= menor; j++) {//verifica do 1 até o menor número
                if (menor%j==0) {//se o menor for divisível pelo contador
                    primo=primo+1;//adiciona 1
            }
        }
        return primo;
    }
}
    

