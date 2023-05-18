package Vetor;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  29/03/2023
 *  Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 *  a. A média dos valores entre 10 e 200;
 *  b. A soma dos números ímpares.
*/ 
public class Vet01 {
    public static void main(String [] args){
        int num[]=new int[50],  somaImpar=0;
        double media=0;
        /*Validação dos índices  */
        for (int i = 0; i < num.length; i++) {
            num[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do "+(i+1)+"º ínndice: ", 3));
            /*Verificação do número ímpar */
            if (num[i]%2!=0) {//se resto diferente de 0 
                somaImpar= somaImpar + num[i]; //adiciona à soma 
            
            }
            /* Verificação dos valores entre 10 e 200 */
            if (num[i]>=10&&num[i]<=200) {
                media=media +num[i];
            }
        }
        JOptionPane.showMessageDialog(null, "A média dos valores entre 10 e 200 é:"+(media/50)+"\nA soma dos números ímpares é: " + somaImpar);
    }
}
