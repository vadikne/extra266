/**
 * Created by owner on 16.10.2017.
 * 99. Дана действительная квадратная матрица порядка 2n.
 * Получить новую матрицу, переставляя ее блоки размера n × n крест-накрест.
 */
public class Ex99 {
    public static void main(String[] args) {
        int n=5;
        int [][]arr = new int[2*n][2*n];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (j<n && i<n)arr[i][j]=1;
                if (j>=n&& i<n)arr[i][j]=2;
                if (j<n&&i >=n)arr[i][j]=3;
                if (j>=n&&i>=n)arr[i][j]=4;
            }
        }
        Ex80.printArr(arr);

        int [][]tempArr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                tempArr[i][j]=arr[i][j];
            }
        }
        Ex80.printArr(tempArr);
        Ex98.changeBlock(arr,4,1);
        for (int i=n;i<arr.length;i++){
            for (int j=n;j<arr.length;j++) {
                arr[i][j]=tempArr[i-n][j-n];
            }
        }

        Ex80.printArr(arr);

        for (int i=0;i<n;i++){
            for (int j=n;j<2*n;j++) {
                tempArr[i][j-n]=arr[i][j];
            }
        }
        Ex80.printArr(tempArr);
        Ex98.changeBlock(arr,3,2);
        for (int i=n;i<arr.length;i++){
            for (int j=0;j<n;j++) {
                arr[i][j]=tempArr[i-n][j];
            }
        }
        Ex80.printArr(arr);
    }
}
