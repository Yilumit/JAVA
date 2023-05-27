package SistemaContaCorrente;

import java.io.IOException;

import javax.swing.JOptionPane;

public class MenuContas {
    public static void main(String[] args) throws IOException{
        Conta conta[] = new Conta[5];
        Movimento movimento[] = new Movimento[10];
        MetodosContas cMetodos = new MetodosContas();
        int validar = 0;

        for (int i = 0; i < conta.length; i++) {
            conta[i] = new Conta();
        }
        for (int i = 0; i < movimento.length; i++) {
            movimento[i] = new Movimento();
        }
        int menu;
        JOptionPane.showMessageDialog(null, "Sistema de Contas");
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(". 1 - Cadastra Contas Correntes\n. 2 - Cadastra movimento\n. 3 - Gera Contas Atualizadas\n. 4 - Consulta cadastros\n. 9 - FIM"));
            switch (menu) {
                case 1:
                    conta = cMetodos.CadastroContas(conta);
                    validar=1;
                    break;
                case 2:
                    if (validar==0) {
                        JOptionPane.showMessageDialog(null, "É necessário fazer o cadastro da Conta!");
                    } else {
                        movimento = cMetodos.CadastroMovimento(movimento, conta);
                        validar = 2;
                    }
                    break;
                case 3:
                    if (validar <2) {
                        JOptionPane.showMessageDialog(null, "É preciso ter movimento em alguma conta!");    
                    } else {
                        
                    }
                    break;
                case 4:
                if (validar == 0) {
                    JOptionPane.showMessageDialog(null, "É necessário fazer o cadastro da Conta!");    
                } else {
                    
                }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizado!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Inválido!");
                    break;
            }    
        } while (menu!=9);
        
    }
}
