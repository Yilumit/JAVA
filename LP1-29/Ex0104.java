import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Converter graus Cº em F
 */
public class Ex0104 {
    public static void main(String args[]){
        double C, F;//Celsius e Fahrenheit
        C=Double.parseDouble(JOptionPane.showInputDialog("Temperatura em Cº: "));
        F=(9*C+160)/5;
        JOptionPane.showMessageDialog(null,"Temperatura em Fahrenheit: "+F);
    }
}
