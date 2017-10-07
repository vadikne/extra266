/**
 * Created by owner on 07.10.2017.
 */
public class Ex91 {
    public static void main(String[] args) {
        int n=10;
        int arr [][]=new int[n][n];
        for (int i=0;i<n;i++){
            int k=1;
            for (int j=i;j<n;j++){
                arr[i][j]=k++;
            }
        }
        for (int i=1;i<n;i++){
            int k=i+1;
            for (int j=0;j<i;j++){
                arr[i][j]=k--;
            }
        }
        Ex80.printArr(arr);
    }
}
