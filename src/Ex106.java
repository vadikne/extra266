/**
 * Created by owner on 24.10.2017.
 * 106. Дана вещественная матрица A размера n × m.
 * Определить k – количество "особых" элементов массива A,
 * считая его элемент особым, если он больше суммы остальных элементов его столбца.
 */
public class Ex106 {
    public static void main(String[] args) {
        int n=40,m=4,counter=0;
        int [][]arr =new int[m][n];
        for (int i=0;i<m;i++){
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        for (int i=0;i<n;i++){
            int max=findMax(arr,i);
            if (max>calcSum(arr,i)-max){
                counter++;
            }
        }
        System.out.println(counter);
    }
public static int findMax(int arr[][],int j){
        int max=arr[0][j];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i][j])max=arr[i][j];
        }
    return max;
    }
    public static int calcSum(int arr[][],int j){
        int sum=0;
        for (int i=0;i<arr.length;i++){
        sum+=arr[i][j];
        }
        return sum;
    }

}
