/**
 * Created by owner on 18.01.2018.
 * 165. Даны три квадратных матрицы A, B, C n-го порядка. Вывести на печать ту из них, норма которой наименьшая.
 * Нормой матрицы считать максимум из абсолютных величин ее элементов.
 */
public class Ex165 {
    public static void main(String[] args) {
        int n=10;
        int [][]arr = new int[n][n];
        int [][]brr = new int[n][n];
        int [][]crr = new int[n][n];
        fillRandomMatrix(arr);
        fillRandomMatrix(brr);
        fillRandomMatrix(crr);
        if (maxNorm(arr)==minOfTwo(maxNorm(crr),minOfTwo(maxNorm(arr),maxNorm(brr))))Ex80.printArr(arr);
        if (maxNorm(brr)==minOfTwo(maxNorm(crr),minOfTwo(maxNorm(arr),maxNorm(brr))))Ex80.printArr(brr);
        if (maxNorm(crr)==minOfTwo(maxNorm(crr),minOfTwo(maxNorm(arr),maxNorm(brr))))Ex80.printArr(crr);
    }
    public static int maxNorm(int [][]arr){
        int maxNorm=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (maxNorm<Math.abs(arr[i][j]))maxNorm=Math.abs(arr[i][j]);
            }
        }
        return maxNorm;
    }
    public static int minOfTwo(int a, int b){
        return a<=b?a:b;
    }

    public static int[][] fillRandomMatrix(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        return arr;
    }
}
