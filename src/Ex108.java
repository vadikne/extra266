/**
 * Created by owner on 26.10.2017.
 * 108. Дана матрица B[N, M]. Найти в каждой строке матрицы
 * максимальный и минимальный элементы и поменять их с первым
 * и последним элементом строки соответственно.
 */
public class Ex108 {
    public static void main(String[] args) {
    int m=4,n=20;
    int [][] arr =new int[m][n];
    for (int i=0; i<m;i++){
        Ex1.fillRandomArray(arr[i]);
    }
        Ex80.printArr(arr);
    for (int i=0;i<m;i++){
        int tmp;
        tmp=arr[i][findMax(arr[i])];
        arr[i][findMax(arr[i])]=arr[i][0];
        arr[i][0]=tmp;
        tmp=arr[i][n-1];
        arr[i][n-1]=arr[i][findMin(arr[i])];
        arr[i][findMin(arr[i])]=tmp;

    }

    Ex80.printArr(arr);
    }
    public static int findMax(int []brr){
        int max=brr[0],indMax=0;
        for(int i=0;i<brr.length;i++){
            if (max<brr[i]){
                max=brr[i];
                indMax=i;
            }

        }
        return indMax;
    }
    public static int findMin(int []brr){
        int min=brr[0],indMin=0;
        for(int i=0;i<brr.length;i++){
            if (min>brr[i]){
                min=brr[i];
                indMin=i;
            }

        }
        return indMin;
    }
}
