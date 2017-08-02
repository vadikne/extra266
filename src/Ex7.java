import java.util.Arrays;

/**
 * 7. Дана последовательность действительных чисел a1, a2, ..., an.
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Ex7 {
    public static void main(String[] args) {


        int[] arr = new int[50];
        int z = 75;
        int counter = 0;
        Ex1.fillRandomArray(arr);
        for (int a: arr ){
            if (a > z) {
                a = z;
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(counter);
    }
}
