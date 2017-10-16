/**
 * Created by owner on 10.10.2017.
 */
public class Ex95 {
    public static void main(String[] args) {
        int [][]arr= new int[10][10];
        for (int i=0;i<arr.length;i++){
            int k=1;
            for (int j=i;j<arr.length;j++){
                arr[i][j]=k++;
            }
        }
        Ex80.printArr(arr);
    }
}
