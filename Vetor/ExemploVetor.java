package Vetor;
/*  Vinicius da Silva Barbosa
 *  21/03/2023
 *  Exemplo de Vetor
*/ 
import javax.swing.JOptionPane;

public class ExemploVetor {
    public static void main(String[] args){
    int i;
    double quantidade[]=new double[5], preco[]=new double[5], total_geral=0, total_vend, comissao;
    //processamento de dados
    for (i = 0; i <= 4; i++) {
        quantidade[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida do "+(i+1)+"º produto: " ));
        preco[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do "+(i+1)+"º produto:"));

    }
    for ( i = 0; i <= 4; i++) {
        total_vend=quantidade[i]*preco[i];
        JOptionPane.showMessageDialog(null, "Quantidade vendida do "+(i+1)+"o produto: "+quantidade[i]+" \nValor do "+(i+1)+"o produto: "+preco[i]+" \nTotal geral da venda: "+total_vend);
        total_geral= total_geral + total_vend;

    }
    comissao=total_geral*0.05;
    JOptionPane.showMessageDialog(null, "Valor total das vendas: "+ total_geral + " \nValor da comissão: "+comissao);
    }
}
