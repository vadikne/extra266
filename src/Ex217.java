/**
 * Created by owner on 19.03.2018.
 * 217. В строке между словами вставить вместо пробела запятую и пробел.
 */
public class Ex217 {
    public static void main(String[] args) {
        String str = new String("мой дядя самых честных правил когда не в шутку занемог");
        str=str.replaceAll(" ",", ");
        System.out.println(str);
    }
}
