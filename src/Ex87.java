/**
 * Created by owner on 03.10.2017.
 */
public class Ex87 {
    public static void main(String[] args) {
        int arr[][]=new int[11][11];
        for (int i=0;i<arr.length;i++){
            System.out.println();
            if (i<=(arr.length-1)/2){
                for (int j=0;j<arr.length;j++){
                    if (j<=i || j>=arr.length-i)arr[i][j]=1;
                }
            }
            else {
                for (int j=0;j<arr.length-i;j++)arr[i][j]=i+j;
            }
        }
        Ex80.printArr(arr);
    }
}
