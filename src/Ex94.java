import java.util.Arrays;

/**
 * Created by owner on 10.10.2017.
 */
public class Ex94 {
    public static void main(String[] args) {
        int n=10;
        int [][] arr =new int[n][n];
        Ex1.fillRandomArray(arr[0]);
        for (int i=1;i<n;i++){
            arr[i]=shiftLeftToOneOnRing(Arrays.copyOf(arr[i-1],n));
        }
        Ex80.printArr(arr);
    }
    public static int [] shiftLeftToOneOnRing(int []arr){
        int tempArr=arr[0];
        for (int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=tempArr;
        return arr;
    }
}
