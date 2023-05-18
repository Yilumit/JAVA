package Function31_45;
import javax.swing.JOptionPane;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Receba um número, calcula e mostra a série 1 + 1/2 + 1/3 + ... + 1/N.
 */
public class FEx0133 {
    public static void main(String[] args) {
        float num, cont, soma;
        num=Float.parseFloat(JOptionPane.showInputDialog("Insira um numero: ", 4));
        cont=1;
        soma=0;
        while (cont<=num) {
            System.out.print(funcSerie(cont, soma)+"\n");
            soma = funcSerie(cont, soma);
            cont=cont+1;
        }     
    }
    static float funcSerie(float cont, float soma ) {
        soma=soma+(1/cont);
        return soma;
    }
}
