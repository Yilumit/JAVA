package Recursividade;
/*  Vinicius da Silva Barbosa
 *  19/03/2023
 *  Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N)
*/ 

import javax.swing.JOptionPane;

public class REx03 {
    public static void main(String[] args){
       
        int num=Integer.parseInt(JOptionPane.showInputDialog("Número: ", 3));
        JOptionPane.showMessageDialog(null, Serie3(num));
    }
    static float Serie3(float num){
        
        if (num>1) {
            return 1/num + Serie3(num-1); 

        }
        return 1;
        
    }
    
}
