import javax.swing.JOptionPane;

/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Faz a média aritmética de 4 notas bimestrais.
 */
public class Ex0121 {
    public static void main(String args[]) {
        float nota1,nota2,nota3,nota4,media;
        nota1=Float.parseFloat(JOptionPane.showInputDialog("Nota do primeiro bimestre:"));
        nota2=Float.parseFloat(JOptionPane.showInputDialog("Nota do segundo bimestre:"));
        nota3=Float.parseFloat(JOptionPane.showInputDialog("Nota do terceiro bimestre:"));
        nota4=Float.parseFloat(JOptionPane.showInputDialog("Nota do quarto bimestre:"));
        media=(nota1+nota2+nota3+nota4)/4;//media aritmética
        if(media>6){
            System.out.print("Aprovado!");
        }else{
            if (media>3) {
                System.out.print("Em Exame!");
            }else{
                System.out.println("Retido!");
            }
        }
    }
}

