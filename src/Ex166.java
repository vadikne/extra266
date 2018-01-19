/**
 * Created by owner on 18.01.2018.
 * 166. Два натуральных числа называются "дружественными", если каждое из
 * них равно сумме всех делителей (кроме его самого) другого (например, числа 220 и 284).
 * Найти все пары "дружественных" чисел, которые не больше данного числа N.
 */
public class Ex166 {
    public static void main(String[] args) {
       int n=10000;
        for (int i = 1; i < n; i++) {
            int k=sumOfDividers(i);
            if (i==sumOfDividers(k) && i!=k) System.out.println(i+" "+k);
        }
    }
    public static int sumOfDividers(int num){
        int sum=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0)sum+=i;
        }
        return sum;
    }
}
