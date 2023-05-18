import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe 2 números inteiros, verifica e mostra todos os números primos existentes entre eles.
 */
public class Ex0140 {
    public static void main(String[] args) {
        int num1, num2, primo, i, j;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:", 11));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero:", 3));
        if (num1<num2) {
            for ( i = num1; i <= num2; i++) {//verifica do menor número até o maior
                primo=0;
                for ( j = 1; j <= i; j++) {//verifica do 1 até o menor número
                    if (i%j==0) {//se o menor for divisível pelo contador
                        primo=primo+1;//adiciona 1
                   }
                }
                if (primo==2) {//se ele for divisível apenas por 1 e por ele mesmo
                    System.out.print(j+" ");//número primo
                }
            }
        } else {
            for ( i = num2; i <= num1; i++) {
                primo=0;
                for (j = 1; j <= i; j++) {
                    if (i%j==0) {
                        primo=primo+1;
                    }
                }
                if (primo==2) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
