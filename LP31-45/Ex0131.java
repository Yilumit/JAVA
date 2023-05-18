/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Calcula e mostra o quadrado dos números entre 10 e 150.
 */
public class Ex0131 {
    public static void main(String[] args) {
        int num, quadrado;
        num=10;
        while (num<=150) {
            quadrado=num*num;
            System.out.print(quadrado+" ");
            num=num+1;
        }
    }
}
