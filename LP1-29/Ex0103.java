import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Mostrar a área de um triângulo
 */
public class Ex0103 {
    public static void main(String args[]){
        double area, Base, h;
        Base=Double.parseDouble(JOptionPane.showInputDialog("Base do triângulo: "));
        h=Double.parseDouble(JOptionPane.showInputDialog("Altura do triângulo: "));
        area=(Base*h)/2;//Cálculo da área
        JOptionPane.showMessageDialog(null,"Área do triângulo: "+area );
     }
}
