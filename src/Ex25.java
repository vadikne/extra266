/**
 * 25. Даны действительные числа а1, а2, ..., аn.
 * Найти  max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).

 */
public class Ex25 {
    public static void main(String[] args) {
        int[] arr = new int[40];
        Ex1.fillRandomArray(arr);
        int max = arr[0];
        int i = 0;
        while (i < arr.length - 1 - i) {
            if (max < (arr[i] + arr[arr.length - 1 - i])) max = (arr[i] + arr[arr.length - 1 - i]);

            System.out.println(arr[i] + " - i=" + i + " - " + arr[arr.length - 1 - i] + "-i= " + (arr.length - 1 - i));

            i++;
            System.out.println(max);
        }
    }
}