/**
 * Created by owner on 11.02.2018.
 * 189. Подсчитать количество цифр в заданном натуральном числе.
 */
public class Ex189 {
    public static void main(String[] args) {
        System.out.println(numOfDigits(12345));
    }
    public static int numOfDigits(int n){
        int count=0;
        if(n==0) return 0;
        count=numOfDigits(n/10)+1;
        return count;
    }
}
