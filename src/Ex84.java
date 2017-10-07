/**
 * Created by owner on 03.10.2017.
 */
public class Ex84 {
    public static void main(String[] args) {
        int arr[][]=new int[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i==0 || j==0 || i==arr.length-1 || j==arr.length-1)arr[i][j]=1;
            }
        }
        Ex80.printArr(arr);
    }
}
