import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo:   "Receba a hora de início e de final de um jogo (HH,MM) sabendo que o 
 *              tempo máximo é de 24 horas e pode começar num dia e terminar noutro."
 */
public class Ex0125 {
    public static void main(String[] args) {
        int horaInicial, horaFinal, minutoInicial, minutoFinal, tempoHora, tempoMinuto;
        horaInicial=Integer.parseInt(JOptionPane.showInputDialog("Hora inicial do jogo: ",10  ));
        minutoInicial=Integer.parseInt(JOptionPane.showInputDialog("Minuto inicial do jogo: ",30  ));
        horaFinal=Integer.parseInt(JOptionPane.showInputDialog("Hora final do jogo: ",15  ));
        minutoFinal=Integer.parseInt(JOptionPane.showInputDialog("Minuto final do jogo: ",40  ));
        if (horaFinal<=horaInicial) {
            if (horaInicial==horaFinal&&minutoFinal>minutoInicial) {
                tempoHora=horaInicial-horaFinal;
            } else {
                horaInicial=24-horaInicial;
                tempoHora=horaFinal+horaInicial;
            }
        } else {
            tempoHora=horaFinal-horaInicial;
        }
        if (minutoFinal<minutoInicial) {
            tempoMinuto=minutoInicial-minutoFinal;
        } else {
            tempoMinuto=minutoFinal-minutoInicial; 
        }
        System.out.print("Tempo de jogo: "+tempoHora+"h e "+tempoMinuto+"min");
    }
}
