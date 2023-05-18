import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Salário com resajuste
 */
public class Ex0102 {
    public static void main(String args[]){
        double salario, Nsalario;
        salario=Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
        Nsalario=salario+(salario*0.15);//Reajuste de 15%
        JOptionPane.showMessageDialog(null,"Salário com reajuste: "+Nsalario);
    }    
}
