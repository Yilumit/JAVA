/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo:   CAlcula a quantidade de litros gastos em uma viagem;
 *              O automovel faz 12km/l;
 *              Recebe tempo de percurso e velocidade media.
 */
import javax.swing.*;

public class Ex0117 {
    public static void main(String[] args) {
        float litros, tempo, distancia, velocidade;
        tempo=Float.parseFloat(JOptionPane.showInputDialog("Tempo de percurso:"));
        velocidade=Float.parseFloat(JOptionPane.showInputDialog("Velocidade média do percurso:"));
        distancia=velocidade*tempo;
        litros=distancia/12;
        System.out.print("Quantidade de litros gastos: "+litros);
    }
}
