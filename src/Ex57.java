import java.util.Arrays;

/**
 * 57. Дан одномерный массив чисел, среди элементов
 * которого есть одинаковые. Создать новый массив из
 * различных элементов исходного массива.

 */
public class Ex57 {
    public static void main(String[] args) {
        int arr[] = new int[100];
        Ex1.fillRandomArray(arr);

        int counter = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j] && i != j) break;
                if (i == arr.length - 1) {
                    counter++;
                    System.out.print(arr[j]+", ");
                }
            }
        }
        System.out.println();
        int m=0;
        int newarr[]= new int[counter];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j] && i != j) break;
                if (i == arr.length - 1) {
                    newarr[m]=arr[j];
                    m++;
                }
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}