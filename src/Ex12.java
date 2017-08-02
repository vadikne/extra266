/**
 * 12. Даны натуральные числа a1, a2, ..., an. Указать те, у которых остаток от деления на М равен L (0 ≤ L ≤ М – 1).

 */
public class Ex12 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        Ex1.fillRandomArray(arr);
        int m=4;
        int l=1;
        for(int a:arr){
            if(a%m==l) System.out.print(a+" ");
        }
    }
}
