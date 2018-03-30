/**
 * Created by owner on 19.03.2018.
 * 218. Удалить часть символьной строки, заключенной в скобки (вместе со скобками).
 */
public class Ex218 {
    public static void main(String[] args) {
        String str = new String("sdf:(sfdsfdg):fd:gdfg:de");
        int first=str.indexOf('(');
        int second = str.indexOf(')');
        str=str.substring(0,first)+str.substring(second+1);
        System.out.println(str);
    }
}
