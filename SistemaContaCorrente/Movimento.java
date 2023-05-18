package SistemaContaCorrente;

public class Movimento {
    int codContaM;
    double valorMovimento;
    int tipoMovimento;
    int statusM;

    Movimento(){
        this(0,0,0,0);
    }
    Movimento(int cod, double valorMove, int tipoM, int status){
        codContaM = cod;
        valorMovimento = valorMove;
        tipoMovimento = tipoM;
        statusM = status; 
    }
}
