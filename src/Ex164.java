import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by owner on 17.01.2018.
 * 164. Даны натуральные числа К и N. Составить программу формирования массива A,
 * элементами которого являются числа, сумма цифр которых равна K и которые не больше N.
 */
public class Ex164 {
    public static void main(String[] args) {
        int k=15;
        int n=1000;
        ArrayList <Integer> arr = new ArrayList(20);
        int sumOfDig=0, i=0;
        while (i<n){
            i++;
            int c= Integer.valueOf(Ex161.countDigits(i));
            int iTemp=i;
            for (int j = c; j >0 ; j--) {
                sumOfDig+=Ex161.separLastDig(iTemp);
                iTemp/=10;
            }
            if (sumOfDig==k)arr.add(i);
            sumOfDig=0;
        }
        System.out.println(Arrays.toString(arr.toArray()));

    }
}
