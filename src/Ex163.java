/**
 * Created by owner on 17.01.2018.
 * 163. Заменить данное натуральное число на число, которое получается
 * из исходного записью его цифр в обратном порядке.
 * Например, дано число 156, нужно получить 651.
 */
public class Ex163 {
    public static void main(String[] args) {
        int a=567;
        int c= Integer.valueOf(Ex161.countDigits(a));
        int b=0;
        for (int i = c; i >0 ; i--) {
            b+=Ex161.separLastDig(a)*(int)Math.pow(10,i-1);
            a/=10;
        }
        System.out.println(b);
    }
}
