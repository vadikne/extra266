/**
 * 49. Напишите программу, входными данными которой является возраст n человек.
 * Программа подсчитывает количество людей, возраст которых находится в
 * интервале 10 лет, а именно:
 <..> человек имеет возраст в диапазоне 0 – 10 лет;
 <..> человек имеет возраст в диапазоне 10 – 20 лет и т.д.

 */
public class Ex49 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        Ex1.fillRandomArray(arr);
        int counter=0;
        for (int i=0;i<100;i+=10){
            for (int j=0;j<arr.length;j++){
                if (arr[j]>i && arr[j]<=i+10)counter++;
            }
            System.out.println("from"+i+"to"+(i+10)+" --"+counter );
            counter=0;
        }
    }

}
