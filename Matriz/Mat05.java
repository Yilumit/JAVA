package Matriz;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  01/03/2023
 *  Carregar códigos das peças em um tabuleiro de xadrez, onde:
 *  |Código: |  1   |   2   |   3   |    4   |    5   |  6  |   7   |
 *  |Peça:   | Peão | Torre | Bispo | Cavalo | Rainha | Rei | Vazio |
 *  Calcular e mostrar a soma das peças do tabuleiro.
 *  Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peça  
*/
public class Mat05 {
    public static void main(String[] args){
        int tabuleiro[][]=new int [8][8], somaPecas[]=new int[7];
        String casa[]=new String[8];
        casa[0] = "h";casa[1]= "g";casa[2]= "f";casa[3]= "e";casa[4]= "d";casa[5]= "c";casa[6]= "b";casa[7]= "a";

        /* Objetivo */
        JOptionPane.showMessageDialog(null,  "Insira uma peça em cada casa do tabuleiro de xadrez, onde:  \n1 = Peão\n2 = Torre\n3 = Bispo \n4 = Cavalo\n5 = Rainha\n6 = Rei\n7 = Vazio");
        System.out.print("1 = Peão\n2 = Torre\n3 = Bispo \n4 = Cavalo\n5 = Rainha\n6 = Rei\n7 = Vazio\n");

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                do {
                    tabuleiro[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Casa "+casa[j]+""+(i+1)+": ", 7));
                    if (tabuleiro[i][j]<1||tabuleiro[i][j]>7) {
                        JOptionPane.showMessageDialog(null,  "Código de peça inválido!");
                    }
                } while (tabuleiro[i][j]<1||tabuleiro[i][j]>7);
                System.out.print(tabuleiro[i][j]+" | ");
                somaPecas[tabuleiro[i][j]-1] = somaPecas[tabuleiro[i][j]-1
                ] + 1;
                
            }
            System.out.println("");
        }
        for (int i = 0; i < somaPecas.length; i++) {
            System.out.println("Número de peças de código "+(i+1)+" :"+somaPecas[i]);
        }
    }
}
