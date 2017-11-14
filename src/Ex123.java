/**
 * Created by owner on 11.11.2017.
 * 123. Для целочисленной квадратной матрицы найти число
 * элементов, кратных k, и наибольший из полученных результатов.
 */
public class Ex123 {
    public static void main(String[] args) {
        int n=5,k=3,max,counter=0;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        max=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]%k==0){
                    counter++;
                    if (max<arr[i][j])max=arr[i][j];
                }
            }
        }
        System.out.println(max+" "+counter);
    }
}
