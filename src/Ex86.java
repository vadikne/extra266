/**
 * Created by owner on 03.10.2017.
 */
public class Ex86 {
    public static void main(String[] args) {
        int arr[][]=new int[11][11];
        for (int i=0;i<arr.length;i++){
            System.out.println();
            if (i<=(arr.length-1)/2){
                for (int j=i;j<arr.length-i;j++)arr[i][j]=1;
            }
            else {
                for (int j=0;j<=i;j++)arr[i][j]=j+arr.length-i;
            }
        }
        Ex80.printArr(arr);
    }
}
