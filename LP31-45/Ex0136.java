import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe um número N; 
 *              Calcula e mostra a série 1 + 1/1! + 1/2! + ... + 1/N!
 */
public class Ex0136 {
    public static void main(String[] args) {
        float N, fat, serie;
        N=Float.parseFloat(JOptionPane.showInputDialog("Insira um numero:", 3));
        fat=1;
        serie=1;
        for (int cont = 1; cont <= N; cont++) {
            fat=fat*cont;//fatorial
            serie=serie+(1/fat);//soma da serie
        }
        System.out.print(serie);
    }
}
