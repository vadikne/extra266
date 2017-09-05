import java.util.Arrays;

/**
 * 59. Даны две последовательности целых чисел
 * а1, а2, ..., аn и b1, b2, ..., bm. Все члены
 * последовательностей – различные числа. Найти,
 * сколько членов первой последовательности совпадают с членами второй последовательности.

 */
public class Ex59 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int brr []= new int[30];
        fillDiff(arr);
        System.out.println(Arrays.toString(arr));
        fillDiff(brr);
        System.out.println(Arrays.toString(brr));
        int counter=0;
        for (int a:arr){
            for (int b:brr){
                if (a==b){
                    counter++;
                    System.out.println(a);
                }
            }
        }
    }

    public static int[] fillDiff(int arr[]){
        arr[0]=(int)(Math.random()*100);
        for (int i=1;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
            for (int j=0;j<i;j++){
                if (arr[i]==arr[j]){
                    i-=1;
                    break;
                }
            }
        }
        return arr;
    }
}
