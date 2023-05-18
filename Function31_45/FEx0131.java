package Function31_45;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Calcula e mostra o quadrado dos números entre 10 e 150.
 */
public class FEx0131 {
    public static void main(String[] args) {
        int num;
        num=10;
        while (num<=150) {
            
            System.out.print(FQuadrado(num)+" ");
            num=num+1;
        }
    }
    static int FQuadrado( int n){
        
        int quadrado=n*n;
        return quadrado;
    }
}
