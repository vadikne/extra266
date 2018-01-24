/**
 * Created by owner on 24.01.2018.
 * 178. На части катушки с автобусными билетами номера шестизначные.
 * Составить программу, определяющую количество счастливых билетов
 * на катушке, если меньший номер билета – N, больший – M (билет
 * является счастливым, если сумма первых трех его цифр равна сумме последних трех).

 */
public class Ex178 {
    public static void main(String[] args) {
        int n=100000, m=999999;
        int sRes=0;
        for (int i = n; i <=m; i++) {
            int s1=0, s2=0;
            int iTmp=i;
            for (int j = 0; j < 6; j++) {
                if (iTmp>999){
                    s1+=Ex161.separLastDig(iTmp);
                    iTmp/=10;
                }
                else {
                    s2+=Ex161.separLastDig(iTmp);
                    iTmp/=10;
                }
            }
            if (s1==s2)sRes++;
        }
        System.out.println(sRes);
    }
}
