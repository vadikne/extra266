import java.util.Arrays;

/**
 * 41. Даны действительные числа а1, а2, ..., an.
 * Требуется умножить все члены последовательности а1, а2, ..., an
 * на квадрат ее наименьшего члена, если ak ≥ (> ?) 0, и на квадрат ее
 * наибольшего члена, если ak ≤ (< ?) 0 (1 ≤ k ≤ n).

 */
public class Ex41 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        Ex1.fillRandomArray(arr);
        for (int i=0;i<arr.length;i+=3)arr[i]*=-1;
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i])min=arr[i];
            if (max<arr[i])max=arr[i];
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0)arr[i]*=Math.pow(min,2);
            if (arr[i]<0)arr[i]*=Math.pow(max,2);
        }
             System.out.println(Arrays.toString(arr));
    }
}
