import java.util.Arrays;

/**
 * 76. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и аi+1. Если ai ≤ ai+1,
 * то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются
 * на один элемент назад. Составить алгоритм этой сортировки.
 */
public class Ex76 {
    public static void main(String[] args) {
        int arr[] =new int[40];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        sortShella(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sortShella(int[]arr){
        int i=0, tmp;
        while (i<arr.length-1){
            if (arr[i]<=arr[i+1])i++;
            else {
                tmp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=tmp;
                if (i>0)i--;
            }
        }
        return arr;
    }
}
