/**
 * Created by owner on 01.11.2017.
 * 113. Дана целочисленная квадратная матрица. Найти в каждой строке
 * наибольший элемент и поменять его местами с элементом главной диагонали.
 */
public class Ex113 {
    public static void main(String[] args) {
        int [][]arr =new int[5][5];
        for (int i=0;i<arr.length;i++){
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        System.out.println();
        for (int i=0;i<arr.length;i++){
            int tmp=arr[i][Ex110.indexMaxOfRow(arr,i)];
            arr[i][Ex110.indexMaxOfRow(arr,i)]=arr[i][0];
            arr[i][0]=tmp;
        }
        Ex80.printArr(arr);
    }
}
