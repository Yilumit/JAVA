package MProcedure16_29;
import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo:   Recebe 3 valores obrigatoriamente em ordem crescente;
 *              Recebe um quarto valor não nescessariamente em ordem;
 *              Mostra os 4 números em ordem crescente.
 */
public class Ex0123 {
    public static void main(String[] args) {
        float n1,n2,n3,n4;
        JOptionPane.showMessageDialog(null, "Digite 3 valores em ordem crescente.");
        n1=Float.parseFloat(JOptionPane.showInputDialog("Valor 1:"));
        do {
            n2=Float.parseFloat(JOptionPane.showInputDialog("Valor 2:"));
            if (n2<n1) {
                JOptionPane.showMessageDialog(null, "O valor precisa ser maior ou igual ao anterior!");
            }
        } while (n2<n1);//Repete enquanto for menor que o anterior
        do {
            n3=Float.parseFloat(JOptionPane.showInputDialog("Valor 3:"));
            if (n3<n2) {
                JOptionPane.showMessageDialog(null, "O valor precisa ser maior ou igual ao anterior!");
            }
        } while (n3<n2);//Repete enquanto for menor que o anterior

        n4=Float.parseFloat(JOptionPane.showInputDialog("Valor 4:"));
        procedureCrescente(n1,n2,n3,n4);

                }
     static void procedureCrescente(float n1, float n2, float n3, float n4){
        /*Ordem crescente dos valores */

        if (n4>n3) {
            System.out.print(n1+" "+n2+" "+n3+" "+n4);
        } else{
            if(n4>n2){
                System.out.print(n1+" "+n2+" "+n4+" "+n3);
            }else{
                if(n4>n1){
                    System.out.print(n1+" "+n4+" "+n2+" "+n3);
                }else{
                    System.out.print(n4+" "+n1+" "+n2+" "+n3);
                }
            }
        }
    }
}

