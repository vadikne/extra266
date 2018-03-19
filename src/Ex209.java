/**
 * Created by owner on 19.03.2018.
 * 209. Дана строка. Подсчитать самую длинную последовательность подряд идущих букв a.
 */
public class Ex209 {
    public static void main(String[] args) {
        String str = new String("qasaawedaaacvfdaadaaaaade");
        int max=0, tmpMax=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)=='a' && str.charAt(i+1)=='a'){
                tmpMax++;
            }
            else if (tmpMax>max){
                max=tmpMax;
                tmpMax=0;
            }
        }
        System.out.println(max);
    }
}
