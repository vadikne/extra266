import java.util.Arrays;

/**
 * 40. Даны целые числа а1, а2, ..., аn и b1, b2, ..., bn.
 * Преобразовать последовательность bl, b2, ..., bn по правилу:
 * если аi ≤ 0, то bi увеличить в 10 раз, иначе bi заменить нулем (i = 1, 2, ..., n).
 */
public class Ex40 {
    public static void main(String[] args) {
        int [] arrA = new int[10];
        int [] arrB = new int[10];
        Ex1.fillRandomArray(arrA);
        Ex1.fillRandomArray(arrB);
        for (int i=0;i<arrA.length;i+=3)arrA[i]*=-1;
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));
        for (int i=0;i<arrA.length;i++){
            if (arrA[i]<=0)arrB[i]*=10;
            else arrB[i]=0;
        }
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));
    }
}
