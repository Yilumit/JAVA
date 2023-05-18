package Function31_45;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Mostra todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */
public class FEx0141 {
    public static void main(String[] args) {
        int cont1, cont2;
        System.out.print("Possibilidades de somas dos lados de 2 dados que seja igual a 7: \n");
        for (cont1 = 1; cont1 <= 7; cont1++) {//a partir do 1 do primeiro dado
            for ( cont2 = 1; cont2 <= 7; cont2++) {//verifica do 1 ao 7 o outro dado
                if (somaDados(cont1,cont2)==true) {//se lado do primeiro + lado do segundo=7  
                    System.out.print(cont1+", "+cont2+"\n");
                }
            }
        }
    }
    static boolean somaDados(int cont1, int cont2){
        if (cont1+cont2==7) {
            return true;
        } else {
            return false;
        }
    }
}

