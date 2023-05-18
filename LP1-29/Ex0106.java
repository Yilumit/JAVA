import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Fazer a troca de valores das variáveis
 */
public class Ex0106 {
    public static void main(String args[]){
        double x, y, z;
        x=Double.parseDouble(JOptionPane.showInputDialog("Dê um valor para x: "));
        y=Double.parseDouble(JOptionPane.showInputDialog("Dê um valor para y: "));
        z=x; x=y; y=z;//troca dos valores
        JOptionPane.showMessageDialog(null,"Valor de x: "+x+"\nValor de y:"+y);
    }
}
