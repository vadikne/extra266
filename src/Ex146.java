/**
 * Created by owner on 12.01.2018.
 * 146. Написать программу нахождения суммы большего и меньшего из 3-х чисел
 */
public class Ex146 {
    public static void main(String[] args) {
        int []arr = new int[3];
        Ex1.fillRandomArray(arr);
        System.out.println(findMax(arr)+findMin(arr));
    }
    public static int findMin(int[]arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i])min=arr[i];
        }
        return min;
    }
    public static int findMax(int[]arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i])max=arr[i];
        }
        return max;
    }
}
