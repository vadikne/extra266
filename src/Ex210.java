/**
 * Created by owner on 19.03.2018.
 * 210. Дана строка символов, среди которых есть одна открывающаяся и одна закрывающаяся скобка.
 * Вывести на экран все символы, расположенные внутри этих скобок.
 */
public class Ex210 {
    public static void main(String[] args) {
        String str = new String("sdfsdf(retett)rgdfgd");
        int first = str.indexOf('(');
        int second = str.indexOf(')');
        System.out.println(str.substring(first+1,second));
    }
}
