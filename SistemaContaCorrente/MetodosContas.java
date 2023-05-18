package SistemaContaCorrente;

import java.util.Random;

import javax.swing.JOptionPane;

public class MetodosContas {
    /*  Funçao Recebendo vetor de regtistro "conta" e Retornando o tipo "Conta[]"*/
    Conta[] CadastroContas(Conta conta[]){
        String tipoContaNome[] = {"Fisica", "Conjunta", "Juridica", "Especial"}; 
        Random codigo = new Random();

        JOptionPane.showMessageDialog(null,  "Cadastro de conta");
        System.out.println("Cadastro de conta\n");

        /*  Cadastro */
        for (int i = 0; i < conta.length; i++) {
             /* Nome do Cliente */
             conta[i].nomeClienteC = JOptionPane.showInputDialog("Insira o nome do titular: ");

            boolean validar = false; 
            /*  Cadastro do Código da Conta */
            do {
                conta[i].codContaC = codigo.nextInt(99)+ 1; //atribui um valor para o código da conta 

                /*  Verifica se o número já está cadastrado */
                for (int j = 0; j < i; j++) {
                    if (conta[i].codContaC == conta[j].codContaC) { // se já cadastrado
                        validar = true;                             // recebe true e continua o loop
                    }else{
                        validar = false;                            //se não, recebe false e sai do loop
                    }

                }
            } while (validar == true);

            /*  Saldo da Conta */
            conta[i].saldoContaC = Double.parseDouble(JOptionPane.showInputDialog("Saldo em conta: "));

            /*  Limite da Conta */
            do {
                conta[i].limiteContaC = Double.parseDouble(JOptionPane.showInputDialog(" Insira o limte da conta:"));

                if (conta[i].limiteContaC < 0) {
                    JOptionPane.showMessageDialog(null, "Limite inválido!");
                }
            } while (conta[i].limiteContaC < 0);

            /*  Tipo de Conta */
            do {
                conta[i].tipoContaC = Integer.parseInt(JOptionPane.showInputDialog( "Tipo de Conta que deseja criar:\n1 - Física\n2 - Conjunta\n3 - Jurídica\n4 - Especial "));
                if (conta[i].tipoContaC < 1 || conta[i].tipoContaC > 4) {
                    JOptionPane.showMessageDialog(null, "Tipo de conta Inválido!");
                }
            } while (conta[i].tipoContaC < 1 || conta[i].tipoContaC > 4);
            
            System.out.println("Nome do titular: "+conta[i].nomeClienteC+"\nCódigo da Conta: "+conta[i].codContaC+"\nSaldo em Conta: "+conta[i].saldoContaC+"\nLimite da Conta: "+conta[i].limiteContaC+"\nTipo de conta: "+tipoContaNome[conta[i].tipoContaC-1]);
            System.out.println("***************************");
        }
        JOptionPane.showMessageDialog(null, "Cadastro Finalizado!");
        
        return conta;
    }
    Movimento[] CadastroMovimento(Movimento movimento[]){

        return movimento;
    }

}
