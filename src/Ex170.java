/**
 * Created by owner on 19.01.2018.
 * 170. Натуральное число, в записи которого n цифр, называется числом Амстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все эти числа от 1 до k.
 * ошибка:
 * Число Армстронга (также самовлюблённое число, совершенный цифровой инвариант; англ. pluperfect digital invariant,
 * PPDI) — натуральное число, которое в данной системе счисления равно сумме своих цифр,
 * возведённых в степень, равную количеству его цифр.
 Число Армстронга — Википедия
 https://ru.wikipedia.org/wiki/Число_Армстронга
 */
public class Ex170 {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            if (sumOfDigArmstrong(i)==i) System.out.println(i);

        }
    }
    public static int sumOfDig(int number){ //оказалось ненужным из-за ошибки в условии
        int sumOfDig=0;
        int n=Ex161.countDigits(number);
        for (int i = 0; i < n; i++) {
            sumOfDig+=Ex161.separLastDig(number);
            number/=10;
        }
        return sumOfDig;
    }
    public static int sumOfDigArmstrong(int number){
        int sumOfDig=0;
        int n=Ex161.countDigits(number);
        for (int i = 0; i < n; i++) {
            sumOfDig+=Math.pow(Ex161.separLastDig(number),n);
            number/=10;
        }
        return sumOfDig;
    }
}
