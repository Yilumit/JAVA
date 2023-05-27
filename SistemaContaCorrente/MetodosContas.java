package SistemaContaCorrente;

import java.io.*;
import java.util.Random;

import javax.swing.JOptionPane;

public class MetodosContas {
    /*  Funçao Recebendo vetor de regtistro "conta" e Retornando o tipo "Conta[]"*/
    Conta[] CadastroContas(Conta conta[]) throws IOException{//Serve para retornar qualquer erro que houver na gravação 
        String fileName = "ArquivoContas.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));

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
        /*  Bubble sort */
        Conta auxiliar[] = new Conta[1];
        auxiliar[0] = new Conta();
        for (int j = 0; j < conta.length-1; j++) {
            for (int j2 = j+1; j2 < conta.length-j; j2++) {
                if (conta[j].codContaC > conta[j2].codContaC) {
                    auxiliar[0] = conta[j];
                    conta[j] = conta[j2];
                    conta[j2] = auxiliar[j2];
                }
            }
        }
        /*  Gravação do cadastro */
        for (int j = 0; j < conta.length; j++) {
            gravar.write(conta[j].nomeClienteC); //Grava o nome do Cliente no arquivo de texto
            gravar.newLine(); //Gera um nova linha no arquivo 

            gravar.write(Integer.toString(conta[j].codContaC));//Transforma 'codContaC' de Int para String e grava no arquivo 
            gravar.newLine();//Linha

            gravar.write(Double.toString(conta[j].saldoContaC));//Faz com que a variável que era 'Double' passe a ser String na hora de fazer a gravação no arquivo
            gravar.newLine();//Linha

            gravar.write(Double.toString(conta[j].limiteContaC));//Faz com que a variável que era 'Double' passe a ser String na hora de fazer a gravação no arquivo
            gravar.newLine();//Linha

            gravar.write(Integer.toString(conta[j].tipoContaC));
            gravar.newLine();

        }
        JOptionPane.showMessageDialog(null, "Cadastro Finalizado!");
        gravar.close();//Especifica que a gravação dos dados está finalizada
        
        return conta;
    }
    Movimento[] CadastroMovimento(Movimento movimento[], Conta conta[])throws IOException{
        String fileName = "ArquivoContas.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
                
        JOptionPane.showMessageDialog(null, "Movimentação de Conta");
        /*  Código da conta */
        for (int i = 0; i < movimento.length; i++) {
            boolean validar = false;
            do {
                movimento[i].codContaM = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da conta: "));
                for (int j = 0; j < conta.length; j++) {
                    if (movimento[i].codContaM == conta[j].codContaC) {
                        validar = true;
                        break;
                    }
                }
                if (validar == false) {
                    JOptionPane.showMessageDialog(null, "Código Inválido!");
                }
            } while (validar == false);
            /*  Valor da Movimentação */
            do {
                movimento[i].valorMovimento = Double.parseDouble(JOptionPane.showInputDialog( "Insira o valor da transação: "));
                
            } while (movimento[i].valorMovimento < 1);
        }
        ler.close();
        return movimento;
    /*Testanto o coment*/
}   
