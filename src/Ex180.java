/**
 * Created by owner on 24.01.2018.
 * 180. Из заданного числа вычли сумму его цифр. Из результата вновь вычли
 * сумму его цифр и т.д. Через сколько таких действий получится нуль?
 */
public class Ex180 {
    public static void main(String[] args) {
        int n=8693, s=0;
        while (n>0){
            n-=Ex170.sumOfDig(n);
            s++;

        }
        System.out.println("через столько "+s);
    }

}
