package MProcedure16_29;
import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo:   Recebe o tipo de investimento e o valor do investimento;
 *              Calcula e mostra o valor corrigido em 30 dias.
 */
public class Ex0129 {
    static int tipoInvestimento;
    static double valorInvestimento;
    public static void main(String[] args) {

//validação do tipo de investimento
        do {
            tipoInvestimento=Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento(1 = poupança e 2 = renda fixa):", 1));
            if (tipoInvestimento<1||tipoInvestimento>2) {
                JOptionPane.showMessageDialog(null, "Tipo invalido!");
            }
        } while (tipoInvestimento<1||tipoInvestimento>2);
        valorInvestimento=Double.parseDouble(JOptionPane.showInputDialog("Valor do investimento:", 1000));
        investimentoCalculo();
        System.out.print("Valor corrigido em 30 dias: "+valorInvestimento);
    }
    static void investimentoCalculo(){
//se tipo de investimento = poupança
        if (tipoInvestimento==1) {
            valorInvestimento=valorInvestimento*1.03;//Rendimento de 3%
        } else {
            valorInvestimento=valorInvestimento*1.05;//Rendimento de 5%
        }
    }
}
