import java.util.Arrays;

/**
 * 29. Даны целые положительные числа а1, а2, ..., an.
 * Найти среди них те, которые являются квадратами некоторого числа m.

 */
public class Ex29 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int m =5;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==m*m) System.out.println(i);
        }
    }
}
