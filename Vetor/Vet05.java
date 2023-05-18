package Vetor;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  29/03/2023
 *  Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
 * 10
 * ∑ (A[1] – A[21–1])
 * i = 1
*/ 
public class Vet05 {
    public static void main(String[] args) {
        int soma=0, vet[]=new int[20];
        for (int i = 0; i < vet.length; i++) {
            vet[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º valor: ", i));

        }
        /*calculo da expressão */
        for (int i = 0; i < 10; i++) {
            soma=soma+(vet[i]-vet[(19-i)]);
        }
        System.out.println("Resultado da expressão: "+soma); 
        JOptionPane.showMessageDialog(null, "Resultado da expressão: "+soma);
    }
}
