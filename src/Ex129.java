/**
 * Created by owner on 14.11.2017.
 * 129. Пусть дана действительная матрица размером n × m.
 * Требуется преобразовать матрицу: поэлементно
 * вычесть последнюю строку из всех строк, кроме последней.
 */
public class Ex129 {
    public static void main(String[] args) {
        int n=5,m=4;
        int [][]arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]-=arr[m-1][j];
            }
        }
        Ex80.printArr(arr);
    }
}
