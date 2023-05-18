package Matriz;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  01/04/2023
 *  Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a 
 *  diagonal principal terá seus dados carregados no programa segundo:
 *  |1  |   |   |   |
 *  |   | 4 |   |   |
 *  |   |   |16 |   |
 *  |   |   |   |64 |
*/
public class Mat02{
    public static void main(String[] args) {
        double mat[][]=new double [4][4];
        /*Entrada dos valores */
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                
                if (i==j) {// verifica se é o índice na diagonal
                    mat[i][j] = Math.pow(4, i);// recebe 4 elevado a 'i'
                } else {
                    mat[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a o índice ["+i+"]["+j+"] : ", j));
                }
            }
        }
        /* Saída */
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" | ");
            }
            System.out.println("");
        }
    }
}
