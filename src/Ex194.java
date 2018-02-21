/**
 * Created by owner on 19.02.2018.
 * 194. Составить программу перевода данного натурального числа в P-ичную систему счисления (2 ≤ P ≤ 9).

 */
public class Ex194 {

        public static void main(String[] args) {
            System.out.println(getDigit(1024));
        }

        public static int RADIX = 2;
        public static String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static String getDigit(int number){
        return (number == 0) ? "" : getDigit(number / RADIX) + digits[number % RADIX];
    }
}
