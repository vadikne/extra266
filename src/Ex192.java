/**
 * Created by owner on 19.02.2018.
 * 192. Составить программу вычисления НОД двух натуральных чисел.
 */
public class Ex192 {
    public static void main(String[] args) {
        int a=12, b=8;
        System.out.println(nodReq(a,b));
    }
    public static int nodReq(int a, int b){
        return b==0? a:nodReq(b, a % b);
    }
}
