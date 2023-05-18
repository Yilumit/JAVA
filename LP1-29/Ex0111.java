import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Calcula e mostra o raio da circunferêcia 
 */
public class Ex0111 {
    public static void main(String[] args) {
        double comprimento, raio;
        raio=Double.parseDouble(JOptionPane.showInputDialog("Raio da circunferência:"));
        comprimento=2*3.14*raio;
        JOptionPane.showMessageDialog(null, "Comprimento da circunferência "+comprimento);
    }
}
