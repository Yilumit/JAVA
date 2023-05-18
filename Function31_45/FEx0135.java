package Function31_45;
import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe 2 números inteiros, verifica qual o maior entre eles;
 *              Calcula e mostra o resultado da somatória dos números ímpares entre esses valores.
 */
public class FEx0135 {
    public static void main(String[] args) {
        int num1, num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:", 9));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:", 3));
        System.out.print("Soma dos valores impares: "+funcSoma(num1,num2));
    }
    
    static int funcSoma(int num1,int num2){
        int soma=0;int resto;
        if (num1<num2) {
            while (num1<=num2) {
                resto=num1%2;
                if (resto!=0) {
                    soma=soma+num1;
                }
                num1=num1+1;
            }
        } else {
            while (num2<=num1) {
                resto=num2%2;
                if (resto!=0) {
                    soma=soma+num2;
                }
                num2=num2+1;
            } 
        }
        return soma;
    }
}