package Matriz;
import javax.swing.JOptionPane;

/*  Calcule a média dos alunos de uma disciplina.  
*   Considere uma matriz de 3 linhas e 2 colunas.
*   Cada linha está associada a um aluno de uma determinada disciplina, e as colunas estão associadas às notas das duas provas referentes aquele estudante.  
*   O programa solicita a nota de cada aluno, exibe a média de cada aluno ((nota1+nota2) /2) e a média de cada prova da turma (prova1 e prova2).  */
public class ExemploMatriz {
    public static void main(String[] args) {
        float nota[][]=new float[3][2], mediaAluno, mediaP1=0, mediaP2=0;
        for (int i = 0; i < nota.length; i++) {
            mediaAluno=0;
            for (int j = 0; j < nota[0].length; j++) {
                nota[i][j]=Float.parseFloat(JOptionPane.showInputDialog("Nota da "+(j+1)+"ª prova do aluno "+(i+1)));
                mediaAluno = mediaAluno + nota[i][j];
                switch (j) {
                    case 0:
                        mediaP1=mediaP1+nota[i][j];
                        break;
                
                    default:
                        mediaP2=mediaP2+nota[i][j];
                        break;
                }
            }
            System.out.println("Média do aluno "+(i+1)+": "+(mediaAluno/2));
        }
        JOptionPane.showMessageDialog(null , "Média da prova 1:  "+(mediaP1/3));
        JOptionPane.showMessageDialog(null , "Média da prova 2:  "+(mediaP2/3));
    }
}
