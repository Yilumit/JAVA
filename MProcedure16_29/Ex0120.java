package MProcedure16_29;
/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Equação de 2º grau(Formula de Bhaskara).
 */
import javax.swing.*;

public class Ex0120 {
    static double a, b, c, delta, x1, x2;
    public static void main(String[] args) {
        
        a=Double.parseDouble(JOptionPane.showInputDialog("Coeficiente A da equacao:"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Coeficiente B da equacao:"));
        c=Double.parseDouble(JOptionPane.showInputDialog("Coeficiente C da equacao:"));
        procedureEquacao();
    }
    static void procedureEquacao(){
        delta=(b*b)-4*a*c;
        if (delta<0){
            System.out.print("Não há raizes reais!");
        }else{
            if(delta==0){
                x1=(-b+Math.sqrt(delta))/(2*a);
                System.out.print("As duas raizes sao iguais a: "+x1);
            }else{
                x1=(-b+Math.sqrt(delta))/(2*a);
                x2=(-b-Math.sqrt(delta))/(2*a);
                System.out.print("Resultado: "+x1+" e "+x2);
            }
        }
    }
}
