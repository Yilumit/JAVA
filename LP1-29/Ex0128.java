import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo:   Recebe o preço atual e a média mensal de um produto. 
 *              Calcula e mostra o novo preço
 */
public class Ex0128 {
    public static void main(String[] args) {
        double precoAtual, mediaMensal, novoPreco;
        precoAtual=Double.parseDouble(JOptionPane.showInputDialog("Preço atual do produto: ", 20));
        mediaMensal=Double.parseDouble(JOptionPane.showInputDialog("Media mensal do produto: ", 400));
        if (mediaMensal<500&&precoAtual<30) {
            novoPreco=precoAtual*1.1;
        } else {
            if (mediaMensal<1000&&precoAtual<80) {
                novoPreco=precoAtual*1.15;  
            } else {
                if (mediaMensal>=1000&&precoAtual>=80) {
                    novoPreco=precoAtual*0.95;
                } else {
                    novoPreco=precoAtual;   
                }
            }
        }
        System.out.print("Novo preço do produto sera de: "+novoPreco);
    }
}
