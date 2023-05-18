package Recursividade;

import javax.swing.JOptionPane;

public class gp {
        public static void main(String[] args) {
            int n =Integer.parseInt(JOptionPane.showInputDialog("Digite o limite da série: ", 3)); // substitua por qualquer valor inteiro positivo para testar a função
            double soma = somarSerieHarmonica(n);
            System.out.printf("Soma da série harmônica até %d: %.2f",n, soma);
        }
        
        public static double somarSerieHarmonica(int n) {
            if (n == 1) {
                return 1.0; // caso base
            } else {
                return 1.0/n + somarSerieHarmonica(n-1); // chamada recursiva
            }
        }
    
}
