/**
 * Created by owner on 19.03.2018.
 * 211. Имеется строка, содержащая буквы латинского алфавита и цифры.
 * Вывести на экран длину наибольшей последовательности цифр, идущих подряд.
 */
public class Ex211 {
    public static void main(String[] args) {
        String str = new String("sdfsdfd23df4562321dfgdf");
        int max=0, tmp=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))tmp++;
            else {
                if (tmp>max)max=tmp;
                tmp=0;
            }
        }
        System.out.println(max);
    }
}
