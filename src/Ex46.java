import java.util.Arrays;

/**
 * 46. Дан массив целых чисел. Найти в этом массиве минимальный элемент
 * N и максимальный элемент M. Получить в порядке возрастания все
 * целые числа из интервала (N; М), которые не входят в данный массив.

 */
public class Ex46 {
    public static void main(String[] args) {
        int arr [] = new int[50];
        Ex1.fillRandomArray(arr);
        int nMin=arr[0];
        int mMax=arr[0];
        for (int i=0; i<arr.length;i++){
            if (nMin>arr[i]) nMin = arr[i];
            if (mMax<arr[i]) mMax = arr[i];
        }
        int [] arr1 = new int[mMax-nMin];
        for (int i=nMin+1;i<arr1.length;i++){
            arr1[i]=i;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
