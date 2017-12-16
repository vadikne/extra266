/**
 * Created by owner on 24.11.2017.
 * 133. Определить номера строк матрицы R[M, N],
 * хотя бы один элемент которых равен C, и элементы этих строк умножить на D.
 */
public class Ex133 {
    public static void main(String[] args) {
        int m=7,n=9,c=45,d=2;
        int [][]arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==c){
                    System.out.println(i);
                    for (int k = 0; k < n; k++) {
                        arr[i][k]*=d;
                    }
                    break;
                }
            }
        }
        System.out.println();
        Ex80.printArr(arr);
    }
}
