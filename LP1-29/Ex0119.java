/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Mostra o maior valor.
 */
import javax.swing.*;

public class Ex0119 {
    public static void main(String[] args) {
        double n1, n2;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero: "));
        if (n1>n2){
            System.out.print("O maior entre eles e: "+n1);
        }else{
            System.out.print("O maior entre eles e: "+n2);
        }
    }
}
