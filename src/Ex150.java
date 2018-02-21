/**
 * Created by owner on 15.01.2018.
 * 150. Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Ex150 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i < 9; i+=2) {
            sum+=factorial(i);
        }
        System.out.println(sum);
    }
    public static int factorial(int num){
        return (num == 0) ? 1 : num * factorial (num - 1);
        }

}
