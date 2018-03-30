/**
 * Created by owner on 20.03.2018.
 * 229. Двумерный массив n × m содержит некоторые буквы русского алфавита, 
 * расположенные в произвольном порядке. Написать программу, проверяющую, 
 * можно ли из этих букв составить данное слово S. 
 * Каждая буква массива используется не более одного раза.
 */
public class Ex229 {
    public static void main(String[] args) {
        Character [][] arr = {{'у','к','е','н','г'},{'ф','ы','в','а','п'},{'р','о','л','д','ж'}};
        String s = "карго";
        boolean check=false, mainCheck=true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    if (s.charAt(i)==arr[j][k]){
                       check=true;
                    }
                    }
                }
                if (check){
                check=false;
                continue;
                }
                else {
                    mainCheck=false;
                    break;
                }
            }
            if (mainCheck) System.out.println("да");
            else System.out.println("нет");
        }
    }

