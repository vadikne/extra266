/**
 * 11. Даны целые числа a1 a2, .... аn. Вывести на печать только те числа, для которых выполняется условие аi ≤ i.

 */
public class Ex11 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        Ex1.fillRandomArray(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=i) System.out.print(arr[i]+" ");
        }

    }
}
