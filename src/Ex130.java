import java.util.Arrays;

/**
 * Created by owner on 14.11.2017.
 * 130. Определить номера тех строк целочисленной матрицы A[M, N],
 * которые совпадают с массивом D[N].
 * Если таких строк нет, выдать соответствующее сообщение.
 */
public class Ex130 {
    public static void main(String[] args) {
        int n=3,m=1000000;
        int [][]arr = new int[m][n];
        int[]brr=new int[n];
        for (int i = 0; i < m; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex1.fillRandomArray(brr);
        System.out.println(Arrays.toString(brr));
        System.out.println();
        // Ex80.printArr(arr);
        for (int i = 0; i < m; i++) {
            if (Arrays.equals(arr[i],brr)) System.out.println(Arrays.toString(arr[i])+" "+i);
        }
    }
}
