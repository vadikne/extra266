/**
 * Created by owner on 19.02.2018.
 * 193. Составить программу нахождения числа, которое образуется из данного натурального
 * числа при записи его цифр в обратном порядке. Например, для числа 1234 получаем ответ 4321.
 */
public class Ex193 {
    public static void main(String[] args) {
        int a=1234;
        reverse(a,0);
    }
    public static void reverse(int a, int b){
        if (a==0) {
            System.out.println(b);
            System.exit(0);
        };
        b*=10;
        b+=a%10;
        a/=10;
        reverse(a,b);

    }
}
