/**
 * Created by owner on 07.11.2017.
 * 115. Задана матрица размером n × m. Найти максимальный по
 * модулю элемент матрицы. Переставить строки и столбцы матрицы таким образом,
 * чтобы максимальный по модулю элемент был расположен на пересечении k-й строки и k-гo столбца.
 */
public class Ex115 {
    public static void main(String[] args) {
        int k=0, n=5, m=4,max,iMax=0,jMax=0, tmp;
        int [][]arr = new int[m][n];
        int [] tempRow = new int[n];
        for (int i = 0; i < m; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        System.out.println();
        max=arr[0][0];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                    iMax=i;
                    jMax=j;
                }
            }
        }
        System.out.println(max+" "+iMax+" "+jMax);
        tempRow=arr[iMax];
        arr[iMax]=arr[k];
        arr[k]=tempRow;
        Ex80.printArr(arr);
        System.out.println();

        for (int i = 0; i < m; i++) {
            tmp=arr[i][jMax];
            arr[i][jMax]=arr[i][k];
            arr[i][k]=tmp;
        }
        Ex80.printArr(arr);
    }
}
