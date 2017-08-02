import java.util.Arrays;

/**
 * 15. Дана последовательность чисел, среди которых имеется один нуль.
 * Вывести на печать все числа, включительно до нуля.
 */
public class Ex15 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int i=0;
        while (i<arr.length && arr[i]!=0) System.out.print(arr[i++]+", ");
        if(i<arr.length)System.out.println(arr[i]);
        else System.out.print("no zero");
    }
}
