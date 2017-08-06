/**
 * 21. Дана последовательность действительных чисел a1, a2, ..., аn.
 * Указать те ее элементы, которые принадлежат отрезку [с, d].
 */
public class Ex21 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        Ex1.fillRandomArray(arr);
        int c=20;
        int d = 60;
        for (int a:arr) {
            if(a>c && a<d) System.out.print(a+" ");
        }
    }
}
