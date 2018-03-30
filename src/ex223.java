import java.util.Arrays;

/**
 * Created by owner on 20.03.2018.
 * 223. В записке слова зашифрованы – каждое из них записано наоборот. Расшифровать сообщение.
 */
public class ex223 {
    public static void main(String[] args) {
        String str = new String("bobo 1dodo 2wewe 4rere");
        String [] arr = str.split(" ");
        StringBuilder rez= new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String tmp=new StringBuilder(arr[i]).reverse().toString();
            rez=rez.append(tmp).append(" ");
        }
        System.out.println(rez);
    }
}
