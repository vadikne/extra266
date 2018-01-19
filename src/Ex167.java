/**
 * Created by owner on 18.01.2018.
 * 167. Два простых числа называются "близнецами", если они
 * отличаются друг от друга на 2 (например, 41 и 43). Напечатать
 * все пары "близнецов" из отрезка [n, 2n], где n – заданное натуральное число большее 2.

 */
public class Ex167 {
    public static void main(String[] args) {
        int n=70;
        for (int i = n; i < 2*n-2; i++) {
            if (Ex166.sumOfDividers(i)==1 && Ex166.sumOfDividers(i+2)==1) System.out.println(i+" "+(i+2));
        }
    }
}
