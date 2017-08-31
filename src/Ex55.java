/**
 * 55. Задан целочисленный массив размерности N.
 * Есть ли среди элементов массива простые числа?
 * Если да, то вывести номера этих элементов.
 */
public class Ex55 {
    public static void main(String[] args) {
        int arr [] = new int[40];
        Ex1.fillRandomArray(arr);
        for (int i=0;i<arr.length;i++){
            for (int j=2;j<arr[i];j++){
                if (arr[i]%j==0)break;
                if (j==i-1) System.out.println("число: "+arr[i]+"  номер: "+i);
            }
        }
    }
}
