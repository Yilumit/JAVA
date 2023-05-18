package Vetor;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  29/03/2023
 *  Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar 
 *  esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
 *  VT1| 1| 2| 3|    |VT2| 4| 5| 6|      |VT3| 1| 2| 3| 4| 5| 6
*/ 
public class Vet03 {
    public static void main(String[] args) {
        int vet1[]=new int[3], vet2[]=new int[3], vet3[]=new int[6], j=0;
        for (int i = 0; i < vet3.length; i++) {
            if (i<3) {
                vet1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º valor do vetor 1: ", i));
                vet3[i]=vet1[i];
            } else {
                vet2[j]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(j+1)+"º valor do vetor 2: ", i));
                vet3[i]=vet2[j];
                j=j+1;
            }
            System.out.println((i+1)+"º valor do terceiro vetor: "+vet3[i]);
        }
    }
}
