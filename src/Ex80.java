import java.util.Arrays;

/**
 * Created by owner on 03.10.2017.
 */
public class Ex80 {
    public static void main(String[] args) {
        int arr[][]=new int[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++)arr[i][j]=j;
            i++;
            for (int j=0;j<arr.length;j++)arr[i][j]=arr.length-1-j;

        }
        printArr(arr);
    }
    public static void printArr(int arr[][]){
        for (int i=0;i<arr.length;i++) System.out.println(Arrays.toString(arr[i]));
    }
}
