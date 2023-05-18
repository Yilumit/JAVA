package Function31_45;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */
public class FEx0142 {
    public static void main(String[] args) {
        float serie, divi;
        serie=1;divi=3;
        for (int cont = 2; cont <=50; cont++) {      
            System.out.print(serie+"\n");
            serie=serie+serieDois(cont, divi);
            divi=divi+2;//divisor + 2
        }
    }
    static float serieDois(float cont, float divi){
        return (cont/divi);
    }
}
