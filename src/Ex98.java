/**
 * Created by owner on 16.10.2017.
 * 98. Дана действительная квадратная матрица порядка 2n.
 * Получить новую матрицу, переставляя ее блоки размера n × n
 * по часовой стрелке, начиная с блока в левом верхнем углу.
 */
public class Ex98 {
    public static void main(String[] args) {
        int n=5;
        int [][]arr = new int[2*n][2*n];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (j<n && i<n)arr[i][j]=1;
                if (j>=n&& i<n)arr[i][j]=2;
                if (j<n&&i >=n)arr[i][j]=3;
                if (j>=n&&i>=n)arr[i][j]=4;
            }
        }
        Ex80.printArr(arr);

        int [][]tempArr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
        tempArr[i][j]=arr[i][j];
            }
        }
        Ex80.printArr(tempArr);
        changeBlock(arr,3,1);
        changeBlock(arr,4,3);
        changeBlock(arr,2,4);

        for (int i=0;i<n;i++){
            for (int j=n;j<arr.length;j++) {
                arr[i][j]=tempArr[i][j-n];
            }
        }
        Ex80.printArr(arr);
    }
    public static int[][]changeBlock(int brr[][],int a,int b){
    int n=brr.length;
    int row=0,col=0,row1=0,col1=0;
        switch (a) {
            case 1:
                col = n/2;
                row = n/2;
                break;
            case 2:
                col = n;
                row = n / 2;
                break;
            case 3:
                col = n / 2;
                row = n;
                break;
            case 4:
                col = n;
                row = n;
                break;
        }
        switch (b) {
            case 1:
                col1 = n/2;
                row1 = n/2;
                break;
            case 2:
                col1 = n;
                row1 = n / 2;
                break;
            case 3:
                col1 = n / 2;
                row1 = n;
                break;
            case 4:
                col1 = n;
                row1 = n;
                break;
        }
        int ii=row1-n/2,jj;
        for (int i=row-n/2;i<row;i++){
            jj=col1-n/2;
            for (int j=col-n/2;j<col;j++) {
            brr[ii][jj]=brr[i][j];
            jj++;
            }
            ii++;
        }
        return brr;
    }

}
