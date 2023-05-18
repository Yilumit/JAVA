package MProcedure16_29;
import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo:   Calcula e mostra a velocidade média em km/h.
 */
public class Ex0127 {
    public static void main(String[] args) {
        float circulo, tempo;
        circulo=Float.parseFloat(JOptionPane.showInputDialog("Extensao do circulo(Em metros):",5000));
        tempo=Float.parseFloat(JOptionPane.showInputDialog("Tempo do percurso(Em minutos):",120));
        int nVoltas=Integer.parseInt(JOptionPane.showInputDialog("Numero de voltas:", 5));
        veloMedia(circulo,tempo,nVoltas);
    }
    static void veloMedia(float circulo, float tempo, float nVoltas){
        circulo=circulo/1000;
        tempo=tempo/60;
        float velo=(circulo*nVoltas)/tempo;
        System.out.print("Velocidade media foi de "+velo+"Km/h");
    }
}

