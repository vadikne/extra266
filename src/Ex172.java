/**
 * Created by owner on 22.01.2018.
 * 172. Найти все простые натуральные числа, не превосходящие n,
 * двоичная запись которых представляет собой палиндром, т.е.
 * читается одинаково слева направо и справа налево.
 */
public class Ex172 {
    public static void main(String[] args) {
        int n=50;
        for (int i = 2; i < n; i++) {
            if (checkSimple(i)){
                String str=Integer.toBinaryString(i);
                if (str.equals(reverseStr(str))) System.out.println(i+" "+str);
            }
        }
    }
    public static boolean checkSimple(int num){
        for (int i = num-1; i >1 ; i--) {
            if (num%i==0)return false;
        }
        return true;
    }
    public static String reverseStr(String string){
        int strLength=string.length();
        String res="";
        for (int i = 0; i < strLength; i++) {
            res=string.charAt(i)+res;
        }
        return res;
    }
}
