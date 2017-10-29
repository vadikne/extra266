/**
 * Created by owner on 24.10.2017.
 */
public class Ex102 {
    public static void main(String[] args) {
        int n=5,k=1;
        int [][]arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=k++;
            }
        }
        Ex80.printArr(arr);
    }
}
