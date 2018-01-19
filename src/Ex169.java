/**
 * Created by owner on 19.01.2018.
 * 169. Написать программу вычисления суммы  1 + 1/2 + 1/3 + … + 1/n  для заданного числа n.
 * Результат представить в виде несократимой дроби –  p/q  (p, q – натуральные).
 */
public class Ex169 {
    public static void main(String[] args) {
        int n=5;
        int rezUp=0,rezDown=1;
        for (int i = 1; i <=n ; i++) {
            int rezUpTemp= Ex168.sumOfFractions(rezUp,rezDown,1,i)[0];
            rezDown = Ex168.sumOfFractions(rezUp,rezDown,1,i)[1];
            rezUp =rezUpTemp;
        }
        System.out.println(rezUp+"/"+rezDown);
    }
}
