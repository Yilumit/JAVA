package Recursividade;
/*  Vinicius da Silva Barbosa
 *  19/03/2023
 *  Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
*/ 
import javax.swing.JOptionPane;

public class REx05{
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para a série: ", 4));
        System.out.print(Serie5(num));

    }
    static int Serie5(int num){
        int fat, x;
        if (num!=1) {
            fat=1;
            x=num;
            do {
                fat= fat*x;//fatorial
                x=x-1;
            } while (x>1);
            
            return fat+Serie5(num-1);
        }
        return 1;
    }
}
