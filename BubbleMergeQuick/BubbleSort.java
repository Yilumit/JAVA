package BubbleMergeQuick;

import java.util.Random;

import javax.swing.JOptionPane;

public class BubbleSort {
    public static void main(String[] args){
        int numeros[]=new int [5], aux;
        Random aleatorio=new Random(); // número aleatório
        /*  Entrada de valores   */
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Número aleatório: ",aleatorio.nextInt(100)));
        }
        /*  Verificação */
        for (int i = 0; i < numeros.length-1; i++) { // a quantidade de vezes que o programa percorrerá o vetor é = número de índices do vetor -1

            /*  Vetor  */ 
            for (int j = 0; j < numeros.length-1-i; j++) { // cada vez que o vetor for percorrido, o maior valor encontrado fica fixo na última posição  
                                                          // Por isso '-i' para limitar o número de comparações  
                /*  Troca dos valores    */
                if (numeros[j] > numeros[j+1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        /*  Números em Ordem */
        System.out.print("Números em ordem: \n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
