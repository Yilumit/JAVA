import javax.swing.JOptionPane;
/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Rendimento de uma aplicação na poupança em 1 mês
 */
public class Ex0108 {
   public static void main(String[] args) {
        double deposito, rendimento;
        deposito=Double.parseDouble(JOptionPane.showInputDialog("Deposito: "));
        rendimento=deposito*1.13;
        System.out.print("Rendimento: "+rendimento);
    }
}
