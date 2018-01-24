/**
 * Created by owner on 22.01.2018.
 * 173. Найти все натуральные n-значные числа, цифры в которых образуют
 * строго возрастающую последовательность (например, 1234, 5789).
 */
public class Ex173 {
    public static void main(String[] args) {
        int n=4;
        for (int i = (int)Math.pow(10,n-1); i < (int)Math.pow(10,n)-1; i++) {
            int iTemp=i;
            int dig=Ex161.separLastDig(iTemp);
            boolean check=true;
            for (int j = 0; j < Ex161.countDigits(i)-1; j++) {
                iTemp/=10;
                if (dig<=Ex161.separLastDig(iTemp)){
                    check=false;
                    break;
                }
                dig=Ex161.separLastDig(iTemp);
            }
            if (check) System.out.println(i);
        }
    }
}
