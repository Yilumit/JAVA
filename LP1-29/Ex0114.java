import javax.swing.JOptionPane;
/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Recebe 2 angulos e calcula o valor do 3º ângulo
 */
public class Ex0114 {
    public static void main(String args[]) {
        double ang1, ang2, ang3;
        ang1= Double.parseDouble(JOptionPane.showInputDialog("Primeiro ângulo: "));
        ang2= Double.parseDouble(JOptionPane.showInputDialog("Segundo ângulo: "));
        ang3=180-(ang1+ang2);
        System.out.print("Terceiro angulo: "+ang3);
    }
}
