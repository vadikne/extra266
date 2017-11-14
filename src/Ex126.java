/**
 * Created by owner on 13.11.2017.
 * 126. В данной действительной квадратной матрице порядка
 * n найти сумму элементов строки, в которой расположен элемент с наименьшим значением.
 * Предполагается, что такой элемент единственный.
 */
public class Ex126 {
    public static void main(String[] args) {
        int n=5,min,iMin=0;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        min=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (min>arr[i][j]){
                    min=arr[i][j];
                    iMin=i;
                }
            }
        }
        System.out.println(min+" "+Ex125.rowSum(arr[iMin]));
    }
}
