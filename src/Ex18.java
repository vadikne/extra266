import java.util.ArrayList;

/**
 * 18. У вас есть доллары. Вы хотите обменять их на рубли.
 * Есть информация о стоимости купли-продажи в банках города. В городе N банков.
 * Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на рубли.
 */
public class Ex18 {
    private static final ArrayList<Bank> banks = new ArrayList<>();
    private static class Bank{
        String name;
        double kurs;

        public Bank(String name, double kurs) {
            this.name = name;
            this.kurs = kurs;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getKurs() {
            return kurs;
        }
        public void setKurs(double kurs) {
            this.kurs = kurs;
        }
    }

    public static void main(String[] args) {
      initBanks(6);
      Bank betterBank= banks.get(0);
      for(Bank bank:banks){
          if(betterBank.getKurs()>bank.getKurs())betterBank=bank;
      }
        System.out.println("this better: "+ betterBank.getName());


    }

    public  static void initBanks(int n) {
        for(int i=0;i<n;i++){
            banks.add(new Bank("Bank".concat(Integer.toString(i)), rnd(26.01,26.21)));
            System.out.println(banks.get(i).getName().toString()+" - "+banks.get(i).getKurs());
        }

    }
    public static double rnd(double min, double max){
        int maxI=(int)(max*100);
        int minI=(int)(min*100);
        maxI-=minI;
        int rndI =(int)(Math.random()*++maxI+minI);
        double rnd =rndI;
        rnd = rnd/100;
         return rnd;
    }

}
