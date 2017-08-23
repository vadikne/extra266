import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 45. Дан массив, состоящий из n натуральных чисел.
 * Образовать новый массив, элементами которого будут
 * элементы исходного, оканчивающиеся па цифру k.

 */
public class Ex45 {
    public static void main(String[] args) {
        int arr[] = new int[50];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int k=4;
        double t;
        int counter=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%10==k)counter++;
            }
        int arr1[]=new int[counter];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%10==k)arr1[j++]=arr[i];
                    }
        System.out.println(Arrays.toString(arr1));
    }
}
