package Vetor;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  29/03/2023
 *  Criar e coletar um vetor [100] inteiro e exibir:
 *  a. O maior e o menor valor;
 *  b. A média dos valores.
*/ 
public class Vet02 {
    public static void main(String[] args) {
        int vet[]=new int[100], maior=0, menor=0;
        double media=0;
        /*Defininndo os valores dos ínndices */
        for (int i = 0; i < vet.length; i++) {
            vet[i]=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do "+(i+1)+"º número: ", i));
            media = media + vet[i];//soma dos valores para descobrir a média dos valores
            /*Verificação do menor número */
            if (vet[i]<menor) {
                menor = vet[i];
            }
            /*Verificação do maior valor */
            if (vet[i]>maior) {
                maior = vet[i];
            }        
        }
        JOptionPane.showMessageDialog(null, "Média dos valores: "+(media/100)+"\nMaior valor: "+maior+"\nMenor valor: "+menor);
    }
}

