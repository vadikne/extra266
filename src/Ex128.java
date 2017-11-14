import java.util.Arrays;

/**
 * Created by owner on 14.11.2017.
 * 128. Дана действительная квадратная матрица порядка n.
 * Преобразовать матрицу по правилу: строку с
 * номером n сделать столбцом с номером n, а столбец с
 * номером n – строкой с номером n.
 * >>> Транспонирование - полный аналог Ex120
 */
public class Ex128 {
    public static void main(String[] args) {
        int n=5;
        int [][]arr=new int[n][n];
        for (int i = 0; i < n; i++) {
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

