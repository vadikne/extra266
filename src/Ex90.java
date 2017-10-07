/**
 * Created by owner on 07.10.2017.
 */
public class Ex90 {
    public static void main(String[] args) {
        int n=10;
        int arr [][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j)arr[i][j]=i+1;
                if (i==n-1-j)arr[i][j]=n-i;
            }
        }
        Ex80.printArr(arr);
    }
}
