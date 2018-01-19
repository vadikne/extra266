/**
 * Created by owner on 17.01.2018.
 * 162. Составить программу, определяющую в каком из данных двух чисел больше цифр.
 */
public class Ex162 {
    public static void main(String[] args) {
        int a=345645645, b=985679;
        System.out.println("больше цифр в: "+ (Ex161.countDigits(a)>Ex161.countDigits(b)? a:b));
    }
}
