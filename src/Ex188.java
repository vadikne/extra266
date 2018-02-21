/**
 * Created by owner on 11.02.2018.
 * 188. Найдите сумму цифр заданного натурального числа.
 */
public class Ex188 {
    public static void main(String[] args) {

        System.out.println(sumOfDigReq(123456));
    }
    public static int sumOfDigReq(int n){
        int sum=0;
        if (n==0)return 0;
        sum=sumOfDigReq(n/10)+n%10;
        return sum;
    }
}
