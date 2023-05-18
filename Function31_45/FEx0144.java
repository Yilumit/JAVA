package Function31_45;
import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe o número da base e do expoente. Calcula e mostra o valor da potência.
 */
public class FEx0144 {
    public static void main(String[] args) {
        int base, expo;
        base=Integer.parseInt(JOptionPane.showInputDialog("Base: ", 5));
        expo=Integer.parseInt(JOptionPane.showInputDialog("Expoente: ", 0));

        JOptionPane.showMessageDialog(null, "Potencia: "+valorPotencia(base,expo));
    }
    static int valorPotencia(int base,int expo){
        int valor;
        if (expo==0) {
            valor=1;
        } else {
            valor=base;
            for ( int cont = 1; cont < expo; cont++) {
                valor=valor*base;
            }
        }
        return valor;
    }
}
