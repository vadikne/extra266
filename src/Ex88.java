/**
 * Created by owner on 05.10.2017.
 */
public class Ex88 {
    public static void main(String[] args) {
        int n=10;
        int arr [][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                arr[i][j]=n-i+j;
            }
        }
        Ex80.printArr(arr);
    }
}
