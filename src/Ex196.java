/**
 * Created by owner on 11.02.2018.
 * 196. Составить программу вычисления суммы:  1! + 2! + 3! + ... + n!  (n ≤ 15).
 * Тип результата значения функции – LongInt
 */
public class Ex196 {
    public static void main(String[] args) {
        int n=15;
        System.out.println(sumFact(n));
    }
    public static long sumFact(int n){
        long sum=0;
        for (int i = 1; i <= n; i++) {
            sum+= Ex150.factorial(i);
        }
        return sum;
    }
}
