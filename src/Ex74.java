import java.util.Arrays;

/**
 * 74. Сортировка обменами. Дана последовательность чисел а1, а2, ..., аn.
 * Требуется переставить числа в порядке возрастания. Для этого сравниваются
 * два соседних числа аi и ai+1. Если аi > аi+1, то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в
 * порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом
 * количество перестановок.

 */
public class Ex74 {
    public static void main(String[] args) {
        int arr[]=new int[40];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int counter=0,tmp,i=0,kontr=0;
        for (;;){
            if(arr[i]>arr[i+1]){
            tmp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
            counter++;
            }
        i++;
        if (i==arr.length-1 && kontr==counter)break;
        if (i==arr.length-1){ i=0; kontr=counter; }
        }
        System.out.println(Arrays.toString(arr));
    }
}
