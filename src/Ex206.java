/**
 * Created by owner on 05.03.2018.
 * 206. Дана строка. Определить, сколько раз входит в нее группа букв  abc .
 */
public class Ex206 {
    public static void main(String[] args) {
        String str = new String("asdfrabckekabc';lrrr");
        int count=0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+3).compareTo("abc")==0)count++;
        }
        System.out.println(count);
    }
}
