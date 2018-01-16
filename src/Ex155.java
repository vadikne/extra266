/**
 * Created by owner on 16.01.2018.
 * 155. Составить программу вычисления суммы факториалов всех четных чисел от m до n.
 */
public class Ex155 {
    public static void main(String[] args) {
        int m=3,n=9;
        int sum=0;
        for (int i = m; i < n; i++) {
            if (i%2==0){
                sum+=Ex150.factorial(i);
            }
        }
        System.out.println(sum);
    }
}
