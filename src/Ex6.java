import java.util.Arrays;

/**
 * 6. Дана последовательность чисел a1, a2, ..., an.
 * Указать наименьшую длину числовой оси, содержащую все эти числа.
 */
public class Ex6 {
    public static void main(String[] args) {
        int [] arr = new int [50];
        Ex1.fillRandomArray(arr);
        int min=arr[1];
        int max=arr[1];
        for(int a : arr){
            if (min>a) min = a;
            if (max<a) max = a;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max-min);
    }
}
