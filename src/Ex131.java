/**
 * Created by owner on 15.11.2017.
 * 131. Определить наименьший элемент каждой четной строки матрицы A[М, N].
 */
public class Ex131 {
    public static void main(String[] args) {
        int n=7;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        for (int i = 0; i < n; i+=2) {
            System.out.println(arr[i][Ex110.indexMinOfRow(arr,i)]);
        }
    }
}
