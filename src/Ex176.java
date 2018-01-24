/**
 * Created by owner on 22.01.2018.
 * 176. Для последовательности  a1=1,  a(n+1)=an+1/(1+an) составить программу печати k-го члена в
 * виде обыкновенной несократимой дроби. Например,  a2 = 3/2 ,  a3 = 19/10 .

 */
public class Ex176 {
    public static void main(String[] args) {
        int k=3;
        int numerator=1, denominator=1;
        for (int i = 1; i <=k-1; i++) {
            int a=numerator;
            int b=denominator;
            int c=Ex168.sumOfFractions(1,1,a,b)[0];
            int d=Ex168.sumOfFractions(1,1,a,b)[1];
            numerator=Ex168.sumOfFractions(a,b,d,c)[0];// c и d по формуле меняются местами
            denominator=Ex168.sumOfFractions(a,b,d,c)[1];
        }
        System.out.println(numerator+"/"+denominator);
    }
}
