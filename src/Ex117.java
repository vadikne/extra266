/**
 * Created by owner on 07.11.2017.
 * 117. Дана действительная матрица размером n × m, все
 * элементы которой различны. В каждой строке выбирается
 * элемент с наименьшим значением, затем среди этих чисел
 * выбирается наибольшее. Указать индексы элемента с найденным значением.
 */
public class Ex117 {
    public static void main(String[] args) {
        int n=5, m=4,max,iMin=0,jMin=0;
        int [][]arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        System.out.println();
        max=arr[0][Ex110.indexMinOfRow(arr,0)];
        for (int i = 1; i < m; i++) {
            if (max<arr[i][Ex110.indexMinOfRow(arr,i)]){
                max=arr[i][Ex110.indexMinOfRow(arr,i)];
                iMin=i;
                jMin=Ex110.indexMinOfRow(arr,i);
            }
        }
        System.out.println(iMin+" "+jMin+" "+max);
    }
}
