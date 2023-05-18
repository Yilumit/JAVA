package Function31_45;
import javax.swing.JOptionPane;
/*  Nome:   Vinicius S. Barbosa
 *  Data:   23/02/2023
 *  Objetivo:   Recebe 100 números inteiros reais; 
 *              Verifica e mostra o maior e o menor valor. Obs.: somente valores positivos.
 */
public class FEx0138 {
        public static void main(String[] args) {
            double maior, menor, num;
            maior=0;menor=0;
            for (int cont = 1; cont < 101; cont++) {
                do {//repete enquanto o número digitado for negativo 
                    num=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero positivo: ", 0)); 
                    if (num<0) {
                        JOptionPane.showMessageDialog(null, "Invalido!");
                        }
                }while (num<0);
                maior =funcMaior(num,maior);//chama a função para verificar se é maior
                menor =funcMenor(num, menor);//chama a função para verificar se é menor
            }
            System.out.print("Maior valor: "+maior+"\nMenor valor: "+menor);
        }
        static double funcMaior(double num, double maior){//função do maior número 
                if (num>maior) {
                   maior=num;
                }
            return maior;
        }
        static double funcMenor(double num, double menor){//função do menor número
            if (num<menor) {
                menor=num;
        }
        return menor;
    }
}
