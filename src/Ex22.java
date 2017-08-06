import java.util.Arrays;

/**
 * 22. Дана последовательность целых положительных чисел.
 * Найти произведение только тех чисел, которые больше заданного числа М.
 * Если таких нет, то выдать сообщение об этом.

 */
public class Ex22 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int m = 97;
        int s = 1;
        for (int a:arr ) {
            if(a>m)s=s*a;
        }
        if (s!=1) System.out.println(s);
        else System.out.println("no");
    }

}
