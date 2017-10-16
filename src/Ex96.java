/**
 * Created by owner on 10.10.2017.
 */
public class Ex96 {
    public static void main(String[] args) {
        int [][]arr =new int[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (j==i || j==arr.length-1-i)arr[i][j]=1;
            }
        }
        Ex80.printArr(arr);
    }
}
