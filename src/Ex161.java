import java.util.Arrays;

/**
 * Created by owner on 16.01.2018.
 * 161. Дано натуральное число N. Составить программу формирования массива,
 * элементами которого являются цифры числа N.
 */
public class Ex161 {
    public static void main(String[] args) {
        int n=323456;
        int []arr = new int[countDigits(n)];
        System.out.println(countDigits(n));
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i]=separLastDig(n);
            n/=10;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int separLastDig(int num){
        return num%10;
    }
    public static int countDigits(int num){
        int numbOfDig=0;
        while (num>=1){
            num/=10;
            numbOfDig++;
        }
        return numbOfDig;
    }
}
