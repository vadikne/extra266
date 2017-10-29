/**
 * Created by owner on 24.10.2017.
 */
public class Ex103 {
    public static void main(String[] args) {
        int n=5;
        int [][]arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j)arr[i][j]=j;
            }
        }
        Ex80.printArr(arr);
    }
}
