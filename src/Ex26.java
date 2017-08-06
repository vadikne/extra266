import java.util.Arrays;

/**
 * 26. В последовательности действительных чисел а1, а2, ..., аn
 * есть только положительные и отрицательные элементы.
 * Вычислить произведение отрицательных элементов P1 и
 * произведение положительных элементов Р2. Сравнить модуль
 * Р2 с модулем Р1 и указать, какое из произведений по модулю больше.

 */
public class Ex26 {
    public static void main(String[] args) {
        int []arr = new int[20];
        int multPos=1;
        int multNeg=1;
        Ex1.fillRandomArray(arr);
        for(int i = 0;i<arr.length;i++) {
         if(i%2==0) arr[i] *= -1;
        if (arr[i]>0)multPos=multPos*arr[i];
        if (arr[i]<0)multNeg=multNeg*arr[i];
        }
        System.out.println(Arrays.toString(arr));
        if(Math.abs(multNeg)>Math.abs(multPos)) System.out.println(multNeg+" больше чем "+multPos);
        else System.out.println(multPos+" больше чем "+multNeg);


    }
}
