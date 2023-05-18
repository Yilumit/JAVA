import javax.swing.JOptionPane;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Receba um número, calcula e mostra a série 1 + 1/2 + 1/3 + ... + 1/N.
 */
public class Ex0133 {
    public static void main(String[] args) {
        float num, cont, soma;
        num=Float.parseFloat(JOptionPane.showInputDialog("Insira um numero: ", 4));
        cont=1;
        soma=0;
        while (cont<=num) {
            soma=soma+(1/cont);
            cont=cont+1;
            System.out.print(soma+"\n");
        }     
    }
}
