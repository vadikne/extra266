/**
 * Created by owner on 03.10.2017.
 */
public class Ex83 {
    public static void main(String[] args) {
        int arr[][]=new int[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i==j)arr[i][j]=(j+1)*(j+1+1);
            }
        }
        Ex80.printArr(arr);
    }
}
