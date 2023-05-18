/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Calcula a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 *              O número de grãos contidos nas casas vão sempre dobrando.
 */
public class Ex0139 {
    public static void main(String[] args) {
        double grao, total;
        grao=1;total=1;
        for (int cont = 1; cont <64; cont++) {
            grao=grao*2;
            total=total+grao;
        }
        System.out.print(total);
    }
}
