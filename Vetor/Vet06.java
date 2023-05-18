package Vetor;

import javax.swing.JOptionPane;

/*  Vinicius da Silva Barbosa
 *  29/03/2023
 *  Criar e coletar em um vetor [20] com números aleatórios. Classificar este 
 *  vetor em ordem crescente e mostrar os dados.
*/ 
public class Vet06 {
    static float num;
    static float vet[]=new float [20];
    public static void main(String[] args) {
        float aux;
        for (int i = 0; i < vet.length; i++) {
            vet[i]=Float.parseFloat(JOptionPane.showInputDialog("Digite um número aleatório: ", i+1));
        }
        /*  Verificação da ordem dos dados  */
        for (int i = 0; i < 19; i++) {// 'i' sendo o número do índece do vetor

            /*Comparação dos valores */
            for (int j = (i+1); j < vet.length; j++) {// 'j' sendo o número do índice que será comparado com 'i'

                /*Troca dos valores */
                if (vet[i]>vet[j]) {//se o valor no índice 'i' maior que o valor no índice 'j' 
                    aux=vet[j];
                    vet[j]=vet[i];
                    vet[i]=aux;
                }
            }
        }
        System.out.println("Valores em ordem crescente: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        num=Float.parseFloat(JOptionPane.showInputDialog("Digite um número que queria pesquisar: ", 30));
        pesquisaBinaria();
    }
/*  Vinicius da Silva Barbosa
 *  29/03/2023
 *  A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e 
 *  verificar a sua existência no vetor (utilizar pesquisa binária).
*/ 
    static void pesquisaBinaria(){
        int auxiliar=0, meio, metadEsquerda=0, metadDireita=vet.length-1;
        while (metadEsquerda<=metadDireita) {
             meio = (metadEsquerda+metadDireita)/2;

            if (vet[meio]==num) {
                System.out.print("O número está na posição :"+meio);
                auxiliar=1;
                break;
            } else if (vet[meio]<num) {
                metadEsquerda= meio +1;
            } else {
                metadDireita= meio-1;
            }  
        }
        if (auxiliar!=1) {
            JOptionPane.showMessageDialog(null,  "Número não encontrado!");
        }
        
    }

}
    