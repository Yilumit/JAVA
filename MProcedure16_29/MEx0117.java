package MProcedure16_29;
/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo:   CAlcula a quantidade de litros gastos em uma viagem;
 *              O automovel faz 12km/l;
 *              Recebe tempo de percurso e velocidade media.
 */
import javax.swing.JOptionPane;

public class MEx0117 {
    static float litros, tempo, distancia, velocidade;
    public static void main(String[] args) {
        
        tempo=Float.parseFloat(JOptionPane.showInputDialog("Tempo de percurso:"));
        velocidade=Float.parseFloat(JOptionPane.showInputDialog("Velocidade média do percurso:"));
        procedureLitros();
        System.out.print("Quantidade de litros gastos: "+litros);
    }
    static void procedureLitros(){
        distancia=velocidade*tempo;
        litros=distancia/12;
    }
}
