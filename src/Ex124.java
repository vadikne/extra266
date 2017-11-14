/**
 * Created by owner on 11.11.2017.
 * 124. Найти наибольший и наименьший элементы прямоугольной матрицы и поменять их местами.
 */
public class Ex124 {
    public static void main(String[] args) {
        int n=5,max,iMax=0,jMax=0,min,iMin=0,jMin=0;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        max=arr[0][0];
        min=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                    iMax=i;
                    jMax=j;
                }
                if (min>arr[i][j]){
                    min=arr[i][j];
                    iMin=i;
                    jMin=j;
                }
            }
        }
        arr[iMax][jMax]=min;
        arr[iMin][jMin]=max;
        System.out.println(max+" "+min);
        Ex80.printArr(arr);
    }
}
