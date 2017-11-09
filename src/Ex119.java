/**
 * Created by owner on 09.11.2017.
 * 119. Для заданной квадратной матрицы сформировать
 * одномерный массив из ее диагональных элементов.
 * Найти след матрицы, суммируя элементы одномерного массива.
 * Преобразовать исходную матрицу по правилу:
 * четные строки разделить // Элементы четныx строк?//
 * на полученное значение, нечетные оставить без изменения.
 */
public class Ex119 {
    public static void main(String[] args) {
        int n=5,trace=0;
        int [][]arr = new int[n][n];
        int[]brr=new int[n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        for (int i = 0; i < n; i++) {
            brr[i]=arr[i][i];
            trace+=brr[i];
        }
        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < n; j++) {
                arr[i][j]/=trace;
            }
        }
        System.out.println();
        Ex80.printArr(arr);
    }
}
