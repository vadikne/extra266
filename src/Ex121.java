import java.util.Arrays;

/**
 * Created by owner on 10.11.2017.
 * 121. Квадратная матрица, симметричная относительно главной диагонали,
 * задана верхним треугольником в виде одномерного массива. Восстановить
 * исходную матрицу и напечатать по строкам.
 */
public class Ex121 {
    public static void main(String[] args) {
        int n=5,k=0;
        int[][]arr=new int[n][n];
        int[]brr=new int[(n*n-n)/2];
        Arrays.fill(brr,1);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                arr[i][j]=brr[k];
                arr[j][i]=brr[k];
            }
        }
        Ex80.printArr(arr);
    }
}
