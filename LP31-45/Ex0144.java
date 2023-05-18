import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe o número da base e do expoente. Calcula e mostra o valor da potência.
 */
public class Ex0144 {
    public static void main(String[] args) {
        int cont, base, expo, valor;
        base=Integer.parseInt(JOptionPane.showInputDialog("Base: ", 5));
        expo=Integer.parseInt(JOptionPane.showInputDialog("Expoente: ", 0));
         if (expo==0) {
            valor=1;
        } else {
            valor=base;
            for ( cont = 1; cont < expo; cont++) {
                valor=valor*base;
            }
        }
        System.out.print("Potencia: "+valor);
    }
}
