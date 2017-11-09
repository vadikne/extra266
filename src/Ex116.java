/**
 * Created by owner on 07.11.2017.
 * 116. Дана квадратная матрица A[N, N]. Записать на место отрицательных
 * элементов матрицы нули, а на место положительных – единицы.
 * Вывести на печать нижнюю треугольную матрицу в общепринятом виде.
 * //скорее всего ошибка в задании -нижняя треугольная матрица это не то.
 */
public class Ex116 {
    public static void main(String[] args) {
        int n=5;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }



        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
         if ((j+i)%3==0)arr[i][j]=arr[i][j]*(-1);
         if (arr[i][j]<0)arr[i][j]=0;
         if (arr[i][j]>0)arr[i][j]=1;
                }
            }
        Ex80.printArr(arr);
        System.out.println();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }
}
