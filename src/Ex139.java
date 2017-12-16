/**
 * Created by owner on 06.12.2017.
 * 139. Дан двумерный массив А. Заменить нулями элементы массива,
 * стоящие в строках или столбцах, где имеются нули.

 */
public class Ex139 {
    public static void main(String[] args) {
        int n=7;
        int [][]arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==0){
                    changeRowOnZero(arr[i]);
                    break;
                }
            }
        }
        Ex80.printArr(arr);
    }
    public static void changeRowOnZero(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }
    }
}
