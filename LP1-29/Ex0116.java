/*  Nome: Vinicius S. Barbosa
 *  Data: 23/02/2023
 *  Objetivo: Calcula o salario e o salario liquido.
 *            A cada dependente é acrescido 100 reais.
 *            Ha um desconto definido pelo usuário.
 */
import javax.swing.JOptionPane;

public class Ex0116 {
    public static void main(String[] args) {
        double valorHora, desconto, horaTrabalhada, despendentes, salario, salarioL;
        horaTrabalhada= Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas: "));//quantidade de horas trabalhadas
        valorHora= Double.parseDouble(JOptionPane.showInputDialog("Valor por hora:"));//valor por hora
        desconto= Double.parseDouble(JOptionPane.showInputDialog("Percentual de desconto:"));//desconto no salário(%)
        despendentes= Double.parseDouble(JOptionPane.showInputDialog("Numero de despendentes:"));//Número de dependentes
        salario=horaTrabalhada*valorHora;//salario bruto
        desconto=desconto/100;
        salarioL=(salario-(salario*desconto))+(100*despendentes);//salario liquido
        System.out.print("Salario liquido: "+salarioL+" reais.");

    }
}
