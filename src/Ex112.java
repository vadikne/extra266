import java.util.Arrays;

/**
 * Created by owner on 31.10.2017.
 * 112. Определить, является ли заданная целая
 * квадратная матрица n-го порядка симметричной (относительно главной диагонали).
 */
public class Ex112 {
    public static void main(String[] args) {


    int n=4;
    int [][]arr={{1,2,1,3},{2,1,2,1},{1,2,1,3},{3,1,3,1}};
        Ex80.printArr(arr);
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j]!=arr[j][i]){
                    System.out.println("не симметрична");
                    System.exit(0);
                }
            }
        }
        System.out.println("Симметрична");
}
}
