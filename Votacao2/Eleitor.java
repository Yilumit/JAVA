package Votacao2;

public class Eleitor {
    int numEleitor;
    String nomeEleitor;
    int secao;

    Eleitor(){
        this(0," ", 0);
    }

    Eleitor(int numeroEleitor, String nome, int numSecao){
        numEleitor = numeroEleitor;
        nomeEleitor = nome;
        secao = numSecao;
    }
}
