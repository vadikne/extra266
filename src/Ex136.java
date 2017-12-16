import java.util.Arrays;

/**
 * Created by owner on 24.11.2017.
 * 136. Дана матрица А. В каждой строке матрицы найти
 * элемент с минимальным значением, затем среди этих
 * значений найти максимальное значение.
 * Напечатать элементы строки, в которой расположено найденное значение, и ее номер.
 */
public class Ex136 {
    public static void main(String[] args) {
        int n=9;
        int [][]arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        int max=0,iMax=0;
        for (int i = 0; i < n; i++) {
            if (max<arr[i][Ex110.indexMinOfRow(arr,i)]){
                max=arr[i][Ex110.indexMinOfRow(arr,i)];
                iMax=i;
            }
        }
        System.out.println("number="+iMax);
        System.out.println(Arrays.toString(arr[iMax]));
    }

}
