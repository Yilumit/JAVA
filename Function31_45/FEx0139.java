package Function31_45;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Calcula a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 *              O número de grãos contidos nas casas vão sempre dobrando.
 */
public class FEx0139 {
    public static void main(String[] args) {
        System.out.print("Numero total de graos contidos no tabuleiro: "+tabuleiro());
    }
    static double tabuleiro(){
        double total=1;
        double grao=1;
        for (int cont = 1; cont <64; cont++) {
            grao=grao*2;
            total=total+grao;
        }
        return total;
    }
}
