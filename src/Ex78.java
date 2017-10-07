import java.util.Arrays;

/**
 * 78. Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi – натуральные).
 * Составить программу, которая приводит эти дроби к общему знаменателю
 * и упорядочивает их в порядке возрастания.

 */
public class Ex78 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int brr[]=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10+1);
            brr[i]=(int)(Math.random()*10+1);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        int common=brr[0];
        for (int i=1;i<brr.length;i++){
            common=nok(common,brr[i]);
        }
        for (int i=0;i<3;i++){
            arr[i]*=common/brr[i];
        }
        Ex76.sortShella(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int nok(int a,int b){
        return a*b/nod(a,b);
    }

    public static int nod(int a,int b){
        for (int i=a;i>=1;i--)if (a%i==0 && b%i==0 )return i;
        return 1;
    }
}
