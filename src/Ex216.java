/**
 * Created by owner on 19.03.2018.
 * 216. В строке удалить символ двоеточие (:) и подсчитать количество удаленных символов.
 */
public class Ex216 {
    public static void main(String[] args) {
        String str = new String("sdf:sfdsfdgfd:gdfg:de");
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==':'){
                str=removeCharAt(str,i);
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(str);
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
