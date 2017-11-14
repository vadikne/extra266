/**
 * Created by owner on 11.11.2017.
 * 122. Задана матрица порядка n и число k.
 * Разделить элементы k-й строки на диагональный элемент, расположенный в этой строке.
 */
public class Ex122 {
    public static void main(String[] args) {
        int n=5,k=3;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        for (int i = 0; i < n; i++) {
            if (i!=k)arr[k][i]/=arr[k][k];
        }
        Ex80.printArr(arr);
    }
}
