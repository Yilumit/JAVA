package Votacao2;

public class Votacao {
    int numEleitor, codCandidato, secao;

    Votacao(){
        this(0,0,0);
    }

    Votacao(int eleitor, int candidato, int numSecao){
        numEleitor  =   eleitor;
        codCandidato =  candidato;
        secao   =       numSecao;
    }
    
    
}
