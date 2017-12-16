import java.util.Arrays;

/**
 * Created by owner on 24.11.2017.
 * 135. Дана квадратная целочисленная матрица порядка n.
 * Сформировать результирующий одномерный массив, элементами
 * которого являются строчные суммы тех строк,
 * которые начинаются с k идущих подряд положительных чисел.
 */
public class Ex135 {
    public static void main(String[] args) {
        int n=20,k=3;
        int brr[]=new int[n];
        int [][]arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);

        for (int i = 0; i < n; i++) {
            boolean yes=false;
            for (int j = 0; j < k; j++) {
                if (arr[i][j]<=0){
                    System.out.println(i);
                    yes=true;
                }
            }
           if (!yes)brr[i]= Ex125.rowSum(arr[i]);
        }
        System.out.println(Arrays.toString(brr));
    }
}
