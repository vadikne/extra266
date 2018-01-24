/**
 * Created by owner on 23.01.2018.
 * 177. Дано натуральное число n. Выяснить, можно ли представить n
 * в виде произведения трех последовательных натуральных чисел.
 */
public class Ex177 {
    public static void main(String[] args) {
        int n=120;
        for (int i = n; i >3 ; i--) {
            if (n/i==(i-1)*(i-2)) System.out.println(n+" "+i+" "+(i-1)+" "+(i-2));
        }
    }
}
