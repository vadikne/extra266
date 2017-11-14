/**
 * Created by owner on 11.11.2017.
 * 125. Дана прямоугольная матрица. Найти строку с наибольшей и
 * наименьшей суммой элементов. Вывести на печать найденные строки и суммы их элементов.
 */
public class Ex125 {
    public static void main(String[] args) {
        int n=9,max,iMax=0,min,iMin=0;
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        max=rowSum(arr[0]);
        min=rowSum(arr[0]);
        for (int i = 0; i < n; i++) {
            if (max<rowSum(arr[i])){
                max=rowSum(arr[i]);
                iMax=i;
            }
            if (min>rowSum(arr[i])){
                min=rowSum(arr[i]);
                iMin=i;
            }
        }
        System.out.println(max+" "+iMax);
        System.out.println(min+" "+iMin);
    }
public static int rowSum(int[]brr){
        int sum=0;
    for (int s:brr) {
        sum+=s;
    }
        return sum;
}
}
