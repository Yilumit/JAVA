package Matriz;
/*  Vinicius da Silva Barbosa
 *  01/03/2023
 *  Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
 *  | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
 *  | 1 | 2 | 2 | 2 | 2 | 2 | 2 | 1 | 
 *  | 1 | 2 | 3 | 3 | 3 | 3 | 2 | 1 |
 *  | 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 |
 *  | 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 |
 *  | 1 | 2 | 3 | 3 | 3 | 3 | 2 | 1 |
 *  | 1 | 2 | 2 | 2 | 2 | 2 | 2 | 1 |
 *  | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |  
*/
public class Mat04 {
    public static void main(String[] args) {
        int espiral[][]=new int [8][8];
        /* números que serão carregados na matriz| */ 
        for (int x = 1; x <= 4; x++) {// <-------|

            /* Espiral diminui a medida que 'x' aumenta */
            for (int i = x-1; i <= espiral.length-x; i++) {//determina o range da matriz onde será gravado os dados

                for (int j = x-1; j <= espiral.length-x; j++) {
                    espiral[i][j] = x;// 'x' é carregado em todos os índices determinados
                }
            }
        }
        /* Saída */
        for (int i = 0; i < espiral.length; i++) {
            for (int j = 0; j < espiral[0].length; j++) {
                System.out.print("| "+espiral[i][j]+" |");
            }
            System.out.println(" ");
        }
    }
}
