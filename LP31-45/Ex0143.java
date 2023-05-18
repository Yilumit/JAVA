/*  Nome:   Vinicius S. Barbosa
 *  Data:   02/03/2023
 *  Objetivo:   Calcula e mostra quantos anos serão necessários para que Ana seja maior que Maria 
 *              Sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
public class Ex0143 {
    public static void main(String[] args) {
        double ana, maria;
        int ano=0;
        ana=1.1;
        maria=1.5;
        while (ana<maria) {
            ana=ana+0.3;
            maria=maria+0.2;
            ano=ano+1;
        }
        System.out.print("Serao necessarios "+ano+" anos.");
    }
}
