import java.util.Arrays;

/**
 * Created by owner on 24.10.2017.
 */
public class Ex101 {
    public static void main(String[] args) {
        int []arr=new int[5];
        Ex1.fillRandomArray(arr);
        long [][]brr=new long[5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                brr[i][j]=(long) Math.pow(arr[j],i);
            }
            System.out.println(Arrays.toString(brr[i]));
        }

    }
}
