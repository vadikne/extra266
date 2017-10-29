import java.util.Arrays;

/**
 * Created by owner on 25.10.2017.
 * 107. Задана квадратная матрица. Переставить строку с максимальным
 * элементом на главной диагонали со строкой с заданным номером m.
 */
public class Ex107 {
    public static void main(String[] args) {
        int m=6,n=7;
        int [][]arr=new int[n][n];
        for (int i=0;i<n;i++){
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        for (int i=0;i<n;i++){
            if (indOfMax(arr[i])==i) {
                System.out.println(i);
                int [] tempArr=Arrays.copyOf(arr[i],n);
                arr[i]=Arrays.copyOf(arr[m],n);
                arr[m]=Arrays.copyOf(tempArr,n);
                break;
            }
        }
        Ex80.printArr(arr);
    }
    public static int maxOfRow(int[]arr){
        int max=arr[0];
        for (int j=0;j<arr.length;j++){
            if (max<arr[j])max=arr[j];
        }
        return max;
    }
    public static int indOfMax(int[]arr){
        //return Arrays.asList(arr).indexOf(maxOfRow(arr));
            for (int i=0;i<arr.length;i++){
                if (arr[i]==maxOfRow(arr))return i;
            }
        return -1;
    }
}
