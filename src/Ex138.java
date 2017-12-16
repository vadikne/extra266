/**
 * Created by owner on 04.12.2017.
 * 138. Дан двумерный массив А. Каждая строка массива
 * упорядочена по не возрастанию. Найти числа,
 * одновременно присутствующие во всех строках массива.
 */
public class Ex138 {
    public static void main(String[] args) {
        int m = 3, n = 50, lastNum;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            Ex1.fillRandomArray(arr[i]);
            sortDown(arr[i]);
        }
        Ex80.printArr(arr);
        System.out.println();
        lastNum = arr[0][0];

        for (int j = 0; j < n; j++) {
            int count = 0;
            if (arr[0][j] < lastNum) {


                for (int k = 0; k < m; k++) {
                    if (findNumber(arr[0][j], arr[k])) count++;
                }
                if (count == m) System.out.println(arr[0][j]);
                count = 0;
                lastNum = arr[0][j];
            }
        }
    }
    public static void sortDown(int []arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>=arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static boolean findNumber(int a, int[]arr){
        for (int b:arr) {
            if (b==a){
                return true;
            }
        }
        return false;
    }
}
