/**
 * Created by owner on 22.01.2018.
 * 174. Найти, все натуральные числа, не превосходящие заданного n, которые делятся на каждую из своих цифр.
 */
public class Ex174 {
    public static void main(String[] args) {
        int n=500;
        for (int i = 0; i < n; i++) {
            int iTemp=i;
            boolean check=true;
            for (int j = 0; j < Ex161.countDigits(i); j++) {
                if (Ex161.separLastDig(iTemp)==0){
                    check=false;
                    break;
                }
                if (i%Ex161.separLastDig(iTemp)!=0){
                    check=false;
                    break;
                }
                iTemp/=10;
            }
            if (check) System.out.println(i);
        }
    }
}
