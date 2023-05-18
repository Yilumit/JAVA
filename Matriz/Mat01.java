package Matriz;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  31/03/2023
 *  Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos 
 *  vendidos em 4 semanas. Calcular e exibir:
 *  a. A quantidade de cada produto vendido no mês;
 *  b. A quantidade de produtos vendidos por semana;
 *  c. O total de produtos vendidos no mês
*/ 
public class Mat01 {
    public static void main(String[] args) {
        int qntd_Produtos[][]=new int [4][3], vendidosMes[]=new int [3], vendidosSem, total_vendidos=0;
        for (int i = 0; i < qntd_Produtos.length; i++) {//'i' == semana
            vendidosSem=0;
            /*Produtos vendidos em uma semana */
            for (int j = 0; j < qntd_Produtos[0].length; j++) {
                /*quantidade de cada produto vendido */
                qntd_Produtos[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto"+(j+1)+" vendido na semana "+(i+1), 10));

                /* soma do total de produtos vendidos */
                total_vendidos= total_vendidos + qntd_Produtos[i][j];

                /* soma da quantidade de produtos vendidos na semana */
                vendidosSem= vendidosSem + qntd_Produtos[i][j];

                /*Soma da quantidade de cada produto vendido no mês */
                vendidosMes[j]= vendidosMes[j] + qntd_Produtos[i][j];
            }
            System.out.println("Quantidade de produtos vendidos na semana "+(i+1)+": "+vendidosSem);
        }
        for (int i = 0; i < vendidosMes.length; i++) {
            JOptionPane.showMessageDialog(null, "Quantidade do produto "+(i+1)+" vendido no mês: "+(vendidosMes[i]));
        }
    }
}
