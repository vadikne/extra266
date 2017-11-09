/**
 * Created by owner on 01.11.2017.
 * 114. Упорядочить по возрастанию элементы каждой строки матрицы размером n × m.
 */
public class Ex114 {
    public static void main(String[] args) {
        int n=5, m=4;
        int [][]arr =new int[m][n];
        for (int i=0;i<arr.length;i++){
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        System.out.println();

        for (int i=0;i<m;i++){
            Ex76.sortShella(arr[i]);
        }
        Ex80.printArr(arr);
    }
}
