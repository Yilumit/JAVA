/*  S = 1/n-1 + 3/n-2 */
import javax.swing.JOptionPane;
public class serieProva {
    public static void main(String[] args) {
        int valor, aux=1;
        /*  Vailidação */
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Número: ", 3));// Número da série
            
            if (valor<1) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        } while (valor<1);// Repete se o valor for menor que 1 
        
        System.out.print("Série: "+FPotencia(valor, aux));//chamada da função
    }
    static float FPotencia(float num, float x){
        float serie;
        if (num>1) {
            serie = (x/num)+FPotencia(num-1, x+2);
            return serie;
        }
        return x; // último termo da série: 'x/1'
    }
}
