/**
 * Created by owner on 07.10.2017.
 */
public class Ex92 {
    public static void main(String[] args) {
        int n=5;
        int arr [][]=new int[2*n][2*n];
        for (int i=0;i<2*n;i++){
            for (int j=0;j<2*n;j++){
                if (i<n&&j<n)arr[i][j]=1;
                if (i<n&&j>=n)arr[i][j]=2;
                if (i>=n&&j<n)arr[i][j]=3;
                if (i>=n&&j>=n)arr[i][j]=4;
            }
        }
        Ex80.printArr(arr);
    }
}
