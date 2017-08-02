/**
 * 20. Дан одномерный массив A[N]. Найти:  mаx(а2, а4, ..., a2k) + min(а1, а3, …, a2k-1).

 */
public class Ex20 {
    public static void main(String[] args) {
        int [] a = new int[40];
        Ex1.fillRandomArray(a);
        int max=a[0];
        int min = a[0];
        for(int i=0; i<a.length; i=i+2){
            if(max<a[i])max=a[i];
            if (min>a[i]) min=a[i];
        }
        System.out.print("min+max="+min+"+"+max+"=");
        System.out.println(min+max);
    }
}
