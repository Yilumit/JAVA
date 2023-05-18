import javax.swing.JOptionPane;

/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe 100 números inteiros reais; 
 *              Verifica e mostra o maior e o menor valor. Obs.: somente valores positivos.
 */
public class Ex0138 {
        public static void main(String[] args) {
            double maior, menor, num;
            maior=0;menor=0;
            for (int cont = 1; cont < 101; cont++) {
                do {
                    num=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero positivo: ", 0)); 
                    if (num<0) {
                        JOptionPane.showMessageDialog(null, "Invalido!");
                    } else {
                        if (num>maior) {
                            maior=num;
                        }
                        if (num<menor) {
                            menor=num;
                        }
                    }
                } while (num<0);
            }
            System.out.print("Maior valor: "+maior+"\nMenor valor: "+menor);
        }
}
