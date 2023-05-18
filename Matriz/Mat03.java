package Matriz;
/*  Vinicius da Silva Barbosa
 *  31/03/2023
 *  Criar uma matriz [8][8] onde o programa irá carregar segundo:
 *  |Casa | 1 | 2 | 3 | 4 |...| EXibir a soma |
 *  |valor| 1 | 2 | 4 | 8 |...| dos valores   |
*/ 
public class Mat03 {
    public static void main(String[] args) {
        int matriz[][]=new int [8][8], somaValores=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 2^j;
                somaValores = somaValores + matriz[i][j];
            }

        }
        System.out.println("Soma dos valores: "+somaValores);
    }
}
