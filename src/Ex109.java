/**
 * Created by owner on 29.10.2017.
 * Дана целая квадратная матрица n-го порядка. Определить, является ли
 * она магическим квадратом, т.е. такой, в которой суммы элементов во
 * всех строках и столбцах одинаковы.
 */
public class Ex109 {
    public static void main(String[] args) {
        int n=5,x,y;
        int [][] arr = new int[n][n];
        for (int i=1;i<=n*n;i++){
            x=2*i-((i-1)/n)-2;
            x=Ex104.checkShift(x,n);
            y=2*i+((i-1)/n)-1;
            y=Ex104.checkShift(y,n);
            if (arr[y][x]==0)arr[y][x]=i;
        }
        Ex80.printArr(arr);
        for (int i=1;i<n;i++){
            if (checkSumOfCol(arr,i)!=checkSumOfCol(arr,0)||checkSumOfRow(arr,i)!=checkSumOfRow(arr,0)){
                System.out.println("не является");
                System.exit(0);
            }
        }
        System.out.println("является");

    }
    public static int checkSumOfRow(int [][]arr,int i){
        int sum =0;
        for (int j=0;j<arr.length;j++){
           sum+=arr[i][j];
        }
        return sum;
    }
    public static int checkSumOfCol(int [][]arr,int i) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j][i];
        }
        return sum;
    }
}
