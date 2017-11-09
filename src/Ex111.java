import java.util.Arrays;

/**
 * Created by owner on 30.10.2017.
 * 111. Дана вещественная матрица размером n × m.
 * Переставляя ее строки и столбцы, добиться того,
 * чтобы наибольший элемент (или один из них) оказался в верхнем левом углу.

 */
public class Ex111 {
    public static void main(String[] args) {
        int m=4, n=5, colMax=0, rowMax=0;
        int [][] arr=new int[m][n];
        int []rowArr=new int[n];
        int []colArr[]=new int[m][1];
        for (int i=0;i<m;i++){
            Ex1.fillRandomArray(arr[i]);
        }
            Ex80.printArr(arr);
        int max = arr[0][0];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
            if(max<arr[i][j]){
                max=arr[i][j];
                colMax=j;
                rowMax=i;
            }
            }
        }
        System.out.println(max+" "+rowMax+" "+colMax);
        rowArr=arr[rowMax];
        arr[rowMax]=arr[0];
        arr[0]=rowArr;
            Ex80.printArr(arr);
        System.out.println();

        for (int i=0;i<m;i++){
            colArr[i][0]=arr[i][colMax];
            arr[i][colMax]=arr[i][0];
            arr[i][0]=colArr[i][0];
        }
            Ex80.printArr(arr);
    }
}
