import java.util.Arrays;

/**
 * 73. Сортировка выбором. Дана последовательность чисел
 * а1, а2, ..., аn. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в
 * массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый – на
 * место наибольшего. Затем, начиная со второго, эта
 * процедура повторяется. Написать алгоритм сортировки выбором.

 */
public class Ex73 {
    public static void main(String[] args) {
        int arr[]=new int[50];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int max;
        int tmp;
        int nTmp;
        for (int i=0;i<arr.length;i++){
            max=0;
            nTmp=i;
            for (int j=i;j<arr.length;j++){
                if (arr[j]>max) {
                    max = arr[j];
                    nTmp = j;
                }
            }
            tmp=arr[i];
            arr[i]=max;
            arr[nTmp]=tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
