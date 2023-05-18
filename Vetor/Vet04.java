package Vetor;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  29/03/2023
 *  Criar e coletar em um vetor [30] real e calcular e exibir:
 *  a. A média do grupo;
 *  b. A quantidade de notas acima do grupo;
 *  c. As posições dos valores abaixo da média do grupo.
*/ 
public class Vet04 {
    public static void main(String[] args) {
        int notas=0, i;
        double vet[]=new double[30], media=0;
        for ( i = 0; i < vet.length; i++) {
            vet[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(i+1)+"ª nota do vetor: ", i)); 
            media=media+vet[i];
        }
        
        media = media/30;//calculo da média
        for ( i = 0; i < vet.length; i++) {
            /*Notas acima da média */
            if (vet[i]>media) {
                notas=notas+1;
            } else {
                if (vet[i]<media) {
                    System.out.println("A nota de posição "+(i+1)+" está abaixo da média!");
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de notas acima da média: "+notas);
    }
}
