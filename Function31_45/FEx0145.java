package Function31_45;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Calcula e mostra a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */
public class FEx0145 {
    public static void main(String[] args) {
        float total=1;//início da série
        for (float cont = 2; cont <= 15; cont++) {
            total=calcSerie(cont,total);
            System.out.print(total+" ");
        }
        System.out.print("\nTotal: "+total);
    }
    static float calcSerie(float cont, float total){
            if (cont%2==0) {//se o dividendo for par 
                total=total-(cont/(cont*cont));//subtrai do total da serie 
            } else {//se for ímpar
                total=total+(cont/(cont*cont));//adicionna ao total da serie 
            }
            return total;
    }
}
