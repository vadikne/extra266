/**
 * Created by owner on 03.10.2017.
 */
public class Ex85 {
    public static void main(String[] args) {
        int arr[][]=new int[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<=arr.length-1-i;j++){
                arr[i][j]=i+1;
            }
        }
        Ex80.printArr(arr);
    }
}
