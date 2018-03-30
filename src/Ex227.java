/**
 * Created by owner on 20.03.2018.
 * 227. Даны две строки A и B. Составьте программу, проверяющую, можно ли из букв,
 * входящих в A, составить B (буквы можно использовать не более одного раза и можно переставлять).
 * Например, A: ИНТЕГРАЛ; B: АГЕНТ – составить можно; В: ГРАФ – нельзя.
 */
public class Ex227 {
    public static void main(String[] args) {
        String a = "интеграл";
        String b = "агент";
        for (int i = 0; i < b.length(); i++) {
            if (a.indexOf(b.charAt(i))>0){
                if (i==b.length()-1) System.out.println("можно");
                continue;
            }
            else {
                System.out.println("нет");
                break;
            }
        }
    }
}
