/**
 * Created by owner on 20.03.2018.
 * 228. Строка содержит произвольный русский текст. Проверить, каких букв в нем больше: гласных или согласных.
 */
public class Ex228 {
    public static void main(String[] args) {
        String glas = new String("уеэоаыяию");
        String str = new String("мой дядя самых честных правил.");
        int countnGlas=0, countSoglas=0;
        for (int i = 0; i < str.length(); i++) {
            if (glas.indexOf(str.charAt(i))>0 && str.charAt(i)!=' ')countnGlas++;
            else if (str.charAt(i)!=' ' && str.charAt(i)!='.')countSoglas++;
        }
        System.out.println("гласных-"+countnGlas+" согласных-"+countSoglas);
    }
}
