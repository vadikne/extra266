/**
 * Created by owner on 29.10.2017.
 * 110. Элемент матрицы назовем "седловой" точкой, если он
 * является наименьшим в своей строке и одновременно наибольшим
 * в своем столбце или, наоборот, является наибольшим в своей
 * строке и наименьшим в своем столбце. Для заданной целой матрицы
 * размером n × m напечатать индексы (координаты) всех ее "седловых" точек.
 */
public class Ex110 {
    public static void main(String[] args) {
        int n=7,m=5, arr[][]=new int[m][n];
        boolean yes=false;
        while (!yes) {
            for (int i=0;i<m;i++){
            Ex1.fillRandomArray(arr[i]);
        }
        //Ex80.printArr(arr);

            for (int i = 0; i < m; i++) {
                // System.out.println(indexMaxOfRow(arr,i)+" - "+indexMinOfRow(arr,i));
                //System.out.println(indexMaxOfCol(arr,i)+" - "+indexMinOfCol(arr,i));
                if (indexMinOfCol(arr, indexMaxOfRow(arr, i)) == i) {
                    System.out.println(arr[i][indexMaxOfRow(arr, i)]+"  "+i+" "+indexMaxOfRow(arr, i));
                    yes=true;
                }
                if (indexMaxOfCol(arr, indexMinOfRow(arr, i)) == i) {
                    System.out.println(arr[i][indexMinOfRow(arr, i)]+"  "+i+" "+indexMinOfRow(arr, i));
                    yes=true;
                }
            }
        }
        Ex80.printArr(arr);
    }
    public static int indexMaxOfRow(int [][]arr,int i){
        int indexMaxOfRow=0,max=arr[i][0];
        for (int j=0;j<arr[0].length;j++){
            if (max<arr[i][j]){
                max=arr[i][j];
                indexMaxOfRow=j;
            }

        }
        return indexMaxOfRow;
    }
    public static int indexMinOfRow(int [][]arr,int i){
        int indexMinOfRow=0,min=arr[i][0];
        for (int j=0;j<arr[0].length;j++){
            if (min>arr[i][j]){
                min=arr[i][j];
                indexMinOfRow=j;
            }

        }
        return indexMinOfRow;
    }
    public static int indexMaxOfCol(int [][]arr,int i){
        int indexMaxOfCol=0,max=arr[0][i];
        for (int j=0;j<arr.length;j++){
            if (max<arr[j][i]){
                max=arr[j][i];
                indexMaxOfCol=j;
            }
        }
        return indexMaxOfCol;
    }
    public static int indexMinOfCol(int [][]arr,int i){
        int indexMinOfCol=0,min=arr[0][i];
        for (int j=0;j<arr.length;j++){
            if (min>arr[j][i]){
                min=arr[j][i];
                indexMinOfCol=j;
            }

        }
        return indexMinOfCol;
    }
}
