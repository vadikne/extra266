/**
 *58. Дан массив из n четырехзначных натуральных чисел.
 * Вывести на экран только те, у которых сумма первых
 * двух цифр равна сумме двух последних.
 */
public class Ex58 {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*1000+1000);

        }
        for(int a:arr){
            if (a/100+a/1000==a%100+a%10) System.out.println(a/100+" "+a/1000+" "+a%100+" "+a%10);
        }
    }
}
