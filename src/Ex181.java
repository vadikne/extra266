/**
 * Created by owner on 25.01.2018.
 * 181. Составить программу разложения данного натурального
 * числа на простые множители. Например,  200 = 23 × 52 .
 */
public class Ex181 {
    public static void main(String[] args) {
        int n=20000;
        boolean check=true;
        while (check){
        for (int i = 2; i <= n; i++) {
        if (n%i==0){
            System.out.print(i+" ");
            n/=i;
            break;
        }
        }
            if (n<2) check=false;
        }
    }

}
