import java.util.Arrays;

/**
 * 8. Последовательность действительных чисел оканчивается нулем. Найти количество членов этой последовательности.

 */
public class Ex8 {
    public static void main(String[] args) {
        int [] arr= new int[50];
        Ex1.fillRandomArray(arr);
        int i=0;
        while (arr[i]!=0 && i<arr.length) i++;
        System.out.println(Arrays.toString(arr));
        System.out.println(i);
    }
}
