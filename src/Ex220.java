/**
 * Created by owner on 19.03.2018.
 * 220. В строке имеется одна точка с запятой. Подсчитать количество символов до и после точки с запятой.
 */
public class Ex220 {
    public static void main(String[] args) {
        String str = new String("sdf;wwee");
        int a = str.indexOf(';');
        System.out.println(" до- " + a+ " после- "+ (str.length()-1-a));
    }
}
