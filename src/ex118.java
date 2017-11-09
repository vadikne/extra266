/**
 * Created by owner on 08.11.2017.
 * 118. Дана действительная квадратная матрица порядка N
 * (N – нечетное), все элементы которой различны. Найти наибольший
 * элемент среди стоящих на главной и побочной диагоналях и поменять
 * его местами с элементом, стоящим на пересечении этих диагоналей.
 */
public class ex118 {
    public static void main(String[] args) {
        int n=5,max,maxI=0;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
        Ex1.fillRandomArray(arr[i]);
    }
        Ex80.printArr(arr);
        max=arr[0][0];
        for (int i = 0; i < n; i++) {
        if (max<arr[i][i]){
            max=arr[i][i];
            maxI=i;
        }
            if (max<arr[n-1-i][n-1-i]){
            max=arr[n-1-i][n-1-i];
            maxI=n-1-i;
            }
        }
        System.out.println(max);
        int tmp=arr[n/2][n/2];
        arr[n/2][n/2]=arr[maxI][maxI];
        arr[maxI][maxI]=tmp;
        System.out.println();
        Ex80.printArr(arr);
}
}