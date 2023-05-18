import javax.swing.JOptionPane;
/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Calcula a hipotenusa
 */
public class Ex0115 {
    public static void main(String[] args) {
        double C1, C2, hipotenusa;
        C1=Double.parseDouble(JOptionPane.showInputDialog("Cateto 1: "));
        C2=Double.parseDouble(JOptionPane.showInputDialog("Cateto 2: "));
        hipotenusa=Math.sqrt((C1*C1)+(C2*C2));
        System.out.print("Hipotenusa: "+hipotenusa);
    }
}
