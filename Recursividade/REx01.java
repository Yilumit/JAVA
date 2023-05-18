package Recursividade;
/*  Vinicius da Silva Barbosa
 *  19/03/2023
 *  Serie1 = (1+2+3+...+100)
*/  

public class REx01{
    public static void main(String[] args) {
        int num=0;
        System.out.print(serie100(num));
    
    }
    static int serie100(int num){
        int serie;
        if (num!=100) {
            serie=num+serie100(num+1);
            return serie;
        }
        return 100;
    }
}