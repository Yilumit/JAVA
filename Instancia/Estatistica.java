package Instancia;
/*
 *  Classe Abstrata 
 *  Ela vai servir pra construir a estrutura da variável 
 *  Meio que serve pra personalizar a variável  
 */

public class Estatistica {
    int     CodigoCidade;
    String  NomeCidade;
    int     QtdAcidentes;
    /*  Construtor  */
    Estatistica(){ 
        this(0," ",0);
    }
    
    Estatistica(int CgCidadeEstatistica, String nmCidade, int Acidente){//antes dos valores serem armazenados na variável final ela precisa passar por um intermediário 
        CodigoCidade = CgCidadeEstatistica;
        NomeCidade = nmCidade;
        QtdAcidentes = Acidente;
    }
}
