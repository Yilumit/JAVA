/*  Número elevado à terceira potência */
import javax.swing.JOptionPane;

public class potencia {
    public static void main(String[] args) {
        int valor, pot=3;
        /*  Vailidação */
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Número para elevar ao cubo: ", 3));
            
            if (valor<1) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        } while (valor<1);// Repete se o valor for menor que 1 
        
        System.out.print(valor+"³ = "+FPotencia(valor, pot));//chamada da função
    }
    static int FPotencia(int num, int pot){
        int serie;
        
        if (pot>1) {
            // Enquanto a potência é diferente de 1 
            serie = num*FPotencia(num, pot-1);// Multiplica o número digitado pelo usuário pelo valor que a função trará

            return serie; // Retorna o valor da série
        }
        /*  Finaliza o loop  */
        return num; //Retorna 'num', o mesmo que 'num^1'
    }
}