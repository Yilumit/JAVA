/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Calcula e mostra a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */
public class Ex0145 {
    public static void main(String[] args) {
        float total=1;
        for (float cont = 2; cont <= 15; cont++) {
            if (cont%2==0) {
                total=total-(cont/(cont*cont));
            } else {
                total=total+(cont/(cont*cont));
            }
            System.out.print(total+" ");
        }
        System.out.print("\nTotal: "+total);
    }
}
