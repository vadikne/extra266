/**
 * Created by owner on 19.02.2018.
 * 197. Составить программу вычисления суммы:  2! + 4! + 6! + ... + n!
 * (n ≤ 16, n – четное). Тип результата значения функции – LongInt .
 */
public class Ex197 {
    public static void main(String[] args) {
         factOdd(16,0);
    }
    public static void factOdd(int n, long sum){
        if (n==0) {
            System.out.println(sum);
            System.exit(0);
        }
        sum+=Ex150.factorial(n);
        n-=2;
        factOdd(n,sum);

    }
}
