import java.util.Arrays;

/**
 * Created by owner on 20.03.2018.
 * 226. Упорядочить данный массив английских слов по алфавиту.
 */
public class Ex226 {
    public static void main(String[] args) {
        String [] arr = {"dog","cat","bird","wolf","lion"};
        int i=0;
        while (i<arr.length-1){
            if (arr[i].charAt(0)<arr[i+1].charAt(0))i++;
            else {
                String tmp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
                if (i>0)i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
