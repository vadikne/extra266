import java.util.Arrays;

/**
 * Created by owner on 09.11.2017.
 * 120. Задана квадратная матрица. Получить транспонированную
 * матрицу, т.е. матрицу, где столбцы и строки меняются местами.
 */
public class Ex120 {
    public static void main(String[] args) {
        int [][]arr=new int[5][5];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(arr[i],i+1);
        }
        Ex80.printArr(arr);
        int k=0,tmp;
        for (int i = k; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                tmp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tmp;
            }
            k++;
        }
        System.out.println();
        Ex80.printArr(arr);
    }
}
