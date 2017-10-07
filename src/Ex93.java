/**
 * Created by owner on 07.10.2017.
 */
public class Ex93 {
    public static void main(String[] args) {
        int n=10+1, x=2;
        int arr [][]=new int[n][n];
        for(int i=0;i<n;i++)arr[0][i]= (int) Math.pow(x,i);
        for(int i=0;i<n;i++)arr[n-1][i]= (int) Math.pow(x,n-1-i);
        for(int i=0;i<n;i++)arr[i][0]= (int) Math.pow(x,i);
        for(int i=0;i<n;i++)arr[i][n-1]= (int) Math.pow(x,n-1-i);
        Ex80.printArr(arr);
    }
}
