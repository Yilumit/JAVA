package Recursividade;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  19/03/2023
 *  Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
*/ 
public class REx04 {
    public static void main(String []args){
        int x=1, num=Integer.parseInt(JOptionPane.showInputDialog("Insira um número para a série: ", 5));
        System.out.print(Serie4(num, x));
    } 
    static float Serie4(float num, int x){
        if (num!=1) {
            
            return num/x+Serie4(num-1,x+1);
        }
        return (num/x);
    }
}
