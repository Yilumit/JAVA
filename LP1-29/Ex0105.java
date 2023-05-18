
import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Calcular equação de 2º grau
 */
public class Ex0105 {
    public static void main(String args[]){
        double a, b, c, result1, result2, delta;
        a=Double.parseDouble(JOptionPane.showInputDialog("Coeficiente A da equação: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("Coeficiente B da equação: "));
        c=Double.parseDouble(JOptionPane.showInputDialog("Coeficiente C da equação: "));
        delta=Math.pow(b,2)-(4*a*c);
        result1=(-b+(Math.sqrt(delta)))/(2*a);
        result2=(-b-(Math.sqrt(delta)))/(2*a);
        JOptionPane.showMessageDialog(null,"Raiz 1: "+result1+"\nRaiz 2: "+result2);
    }
}
