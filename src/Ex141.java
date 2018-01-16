import java.util.Arrays;

/**
 * Created by owner on 16.12.2017.
 * 141. Лабиринт задан квадратной матрицей А. Аk = 0, если клетка "проходима";
 * Аk = 1, если клетка "непроходима". Начальное положение путника задается в
 * проходимой клетке А = 0. Путник может перемещаться из одной проходимой клетки
 * в другую, если они имеют общую сторону. Путник выходит из лабиринта, когда
 * попадает в граничную клетку. Может ли путник выйти из лабиринта? Если может,
 * то напечатать путь от выхода (в виде координат точек на маршруте) до начального
 * положения путника. Путь должен иметь минимальную длину.
 */
public class Ex141 {
    public static void main(String[] args) {
        int [][]arr={{0,0,1,1,0,1,1,0},
                     {1,0,1,0,1,1,1,0},
                     {1,0,0,0,0,1,1,0},
                     {1,1,1,0,1,1,1,0},
                     {0,0,0,0,0,1,1,0},
                     {0,0,1,1,0,1,1,0},
                     {0,0,1,1,0,1,1,0},
                     {0,0,1,1,0,1,1,0},};
        Ex80.printArr(arr);
        int value=2;
        arr[0][0]=value;
        while (findNext(arr,value)){
            value++;
        }
        System.out.println();
        Ex80.printArr(arr);
        int []indOfMin=findMinOfPerimeter(arr);
        System.out.println(Arrays.toString(indOfMin));
        seekWay(arr,indOfMin[0],indOfMin[1]);
    }
    public static void seekWay(int [][] arr, int row, int col){
        int value=arr[row][col];
        while (value>=2) {
            System.out.println(value+" : "+value+" col="+col+" row="+row);
            if (col + 1 < arr.length) {
                if (arr[row][col + 1] == value - 1) {
                    col++;
                    value--;
                    continue;

                }
            }
            if (col - 1 >= 0) {
                if (arr[row][col - 1] == value - 1) {
                    col--;
                    value--;
                    continue;
                }
            }
            if (row + 1 < arr.length) {
                if (arr[row + 1][col] == value - 1) {
                    row++;
                    value--;
                    continue;
                }
            }
            if (row - 1 >= 0) {
                if (arr[row - 1][col] == value - 1) {
                    row--;
                    value--;
                    continue;
                }
            }
        }

    }


    public static int[] findMinOfPerimeter(int[][]arr){
        int []indOfMin=new int[2];
        int min=arr.length*2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j==0 || j==arr.length-1 || i==0 || i==arr.length){
                  if (arr[i][j]>3 && min>arr[i][j]){
                      min=arr[i][j];
                      indOfMin[0]=i;
                      indOfMin[1]=j;
                  }
                }
            }
        }
        return indOfMin;
    }

    public static boolean findNext(int[][]arr, int value){
        boolean checkFind=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]==value){
                    if (markAround(arr,i,j,value))checkFind=true;
                }
            }
        }
        return checkFind;
    }

    public static boolean markAround(int [][] arr, int row, int col, int value){
        boolean check=false;
        if (col+1<arr.length){
            if (arr[row][col+1]==0){
                arr[row][col+1]=value+1;
                check=true;
            }
        }
        if (col-1>=0){
            if (arr[row][col-1]==0){
                arr[row][col-1]=value+1;
                check=true;
            }
        }
        if (row+1<arr.length){
            if (arr[row+1][col]==0){
                arr[row+1][col]=value+1;
                check=true;
            }
        }
        if (row-1>=0){
            if (arr[row-1][col]==0){
                arr[row-1][col]=value+1;
                check=true;
            }
        }
        return check;
    }
}
