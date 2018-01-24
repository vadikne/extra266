/**
 * Created by owner on 21.01.2018.
 * 171. Написать программу, которая находит и выводит на печать все
 * четырехзначные числа вида abcd, для которых выполняется: ab-cd=a+b+c+d a, b, c, d – разные цифры;  .

 */
public class Ex171 {
    public static void main(String[] args) {
        for (int i = 1000; i < 9999; i++) {
           if (Ex170.sumOfDig(i)==countAB_CD(i)) System.out.println(i);
        }
    }
    public static int countAB_CD(int number){
        int rez=0;
        int d=Ex161.separLastDig(number);
            number/=10;
        int c=Ex161.separLastDig(number);
            number/=10;
        int b=Ex161.separLastDig(number);
            number/=10;
        int a=Ex161.separLastDig(number);
            number/=10;

        return a*b-c*d;
    }
}
