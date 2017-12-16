/**
 * Created by owner on 01.12.2017.
 * 137. Дан двумерный массив А, каждый элемент которого
 * равен 0, 1, 5 или 11. Подсчитать в нем количество четверок
 * (Аj,k, Аj,k+1, Аj+1,k, Аj+1,k+1) в каждой из которых все элементы различные.

 */
public class Ex137 {
    public static void main(String[] args) {
        int n=3;
        int [][]arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            if (arr[i][j]%2==0)arr[i][j]=0;
                if (arr[i][j]%3==0)arr[i][j]=1;
                if (arr[i][j]%4==0)arr[i][j]=5;
                if (arr[i][j]%5==0)arr[i][j]=11;
            }
        }
        Ex80.printArr(arr);
        int count=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (checkFour(arr,j,i)) count++;
            }
        }
        System.out.println(count);

    }
    public static boolean checkFour(int [][]arr,int col,int row){
        boolean check=false;
        if (arr[row][col]!=arr[row+1][col]&& arr[row][col]!=arr[row][col+1]&& arr[row][col]!=arr[row+1][col+1]){
            if (arr[row][col+1]!=arr[row+1][col]&&arr[row][col+1]!=arr[row+1][col+1]){
                if (arr[row+1][col]!=arr[row+1][col+1]){
                    check=true;
                }
            }

        }
        return check;
    }
}
