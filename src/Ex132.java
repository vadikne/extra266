/**
 * Created by owner on 15.11.2017.
 * 132. Расположить столбцы матрицы D[M, N] в порядке
 * возрастания элементов k-ой строки (1 ≤ k ≤ М).
 */
public class Ex132 {
    public static void main(String[] args) {
        int n=5,m=4,k=0;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        System.out.println();
        int max;
        int iMax=0;
        for (int i = 0; i < n; i++) {
            max=arr[k][i];
            iMax=i;
            for (int j = i; j < n; j++) {
                if (max<arr[k][j]){
                    max=arr[k][j];
                    iMax=j;
                }
            }
            System.out.println(max+" "+" i="+i+" iMax="+iMax);
        //   arr[k][iMax]=arr[k][i];
        //   arr[k][i]=max;

            exchangeOfColumn(arr,i,iMax);


        }


        Ex80.printArr(arr);
    }

    public static void exchangeOfColumn(int [][]arr, int x, int y){
        for (int i=0;i<arr.length;i++){
        int tmp =arr[i][x];
        arr[i][x]=arr[i][y];
        arr[i][y]=tmp;
        }
    }
}
