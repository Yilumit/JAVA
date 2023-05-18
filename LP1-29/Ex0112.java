import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Calcula sua idade e mostra quantos anos terá em 17 anos
 */
public class Ex0112 {
    public static void main(String[] args) {
        int nasc, idade, idadeFutura;
        nasc=Integer.parseInt(JOptionPane.showInputDialog("Ano de nasccimento: "));
        idade=2023-nasc;
        idadeFutura=idade+17;
        System.out.println("Idade atual: "+idade+"\nIdade daqui 17 anos: "+idadeFutura);
    }
}
