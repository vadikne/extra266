import java.util.Arrays;

/**Дана последовательность натуральных чисел a1, a2, ..., an. Создать массив
 * из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
 */


 public class Ex5 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Ex1.fillRandomArray(arr);
        int counter = 0;
        for (int a : arr) if (a%2==0)counter++;
        System.out.println(counter);
        if (counter==0)System.exit(0);
        int [] arrRes = new int [counter];
        int j=0;
        for (int a :arr){
            if (a%2==0){
                arrRes[j]=a;
                j++;
            }
        }
        System.out.println(Arrays.toString(arrRes));
    }
}