/**
 * Created by owner on 19.03.2018.
 * 215. В строке заменить все двоеточия (:) точкой с запятой (;). Подсчитать количество таких замен.
 */
public class Ex215 {
    public static void main(String[] args) {
        String str = new String("sadsa:sdasd:ddd:dafefe:f");
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==':')counter++;
        }
        str= str.replace(':',';');
        System.out.println(str);
        System.out.println(counter);
    }
}
