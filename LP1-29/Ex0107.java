import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Calcular o volume de um paralelepípedo
 */
public class Ex0107 {
    public static void main(String args[]){
        double comprimento, altura, largura, volume;
        comprimento=Double.parseDouble(JOptionPane.showInputDialog("Comprimento do paralelepípedo: "));
        largura=Double.parseDouble(JOptionPane.showInputDialog("Largura do paralelepípedo: "));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Altura do paralelepípedo: "));
        volume=comprimento*largura*altura;
        JOptionPane.showMessageDialog(null, "Volume: "+volume);
    }
}
