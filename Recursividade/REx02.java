package Recursividade;
/*  Vinicius da Silva Barbosa
 *  19/03/2023
 *  Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
*/ 

import javax.swing.JOptionPane;

public class REx02 {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Um número: ", 10));
        JOptionPane.showMessageDialog(null, Serie2(num));
    }
    static int Serie2(int num){
        int serie;
        if (num!=1) {
            serie=num+Serie2(num-1);
            return serie;
        }
        return 1;
    }
}
