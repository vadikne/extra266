/**
 * Created by owner on 26.01.2018.
 * 183. Дано четное число n > 2. Проверить для него гипотезу Гольдбаха:
 * каждое четное n представляется в виде суммы двух простых чисел.
 */
public class Ex183 {
    public static void main(String[] args) {
        int n=80;
        for (int i = n-1; i >n/2 ; i--) {
            if (Ex172.checkSimple(i) && Ex172.checkSimple(n-i)) System.out.println(i+" "+(n-i));
        }
    }
}
