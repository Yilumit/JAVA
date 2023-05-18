import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo: Calcula quantos dias durará a quantidade de alimento definida pelo usuário,
 *            sabendo que a pessoa consome 50g por dia
 */
public class Ex0113 {
    public static void main(String[] args) {
        double Kg, tempo;
        Kg=Double.parseDouble(JOptionPane.showInputDialog("Quantidade de alimento(em Kg): "));
        Kg=Kg*1000;
        tempo=Kg/50;
        System.out.println("Durará "+tempo+" dias");
    }
}
