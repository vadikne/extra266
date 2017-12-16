/**
 * Created by owner on 24.11.2017.
 * 134. Матрица A[N, М] (М кратно 4) разделена по вертикали
 * на две половины. Определить сумму элементов каждого столбца
 * левой половины и сумму элементов
 * каждого четного столбца правой половины матрицы A.
 */
public class Ex134 {
    public static void main(String[] args) {
        int m=12,n=5;
        int [][]arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        for (int i = 0; i < m; i++) {
        if (i<m/2 | i%2==0){
            System.out.print(sumOfCol(arr,i)+"("+i+")");
        }
        }
    }
    public static int sumOfCol(int[][]arr,int j){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
         sum+=arr[i][j];
        }
        return sum;
    }
}
