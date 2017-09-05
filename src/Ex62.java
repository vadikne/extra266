/**
 * 62. Дан массив А. Найти длину самой длинной последовательности
 * подряд идущих элементов массива, равных нулю.

 */
public class Ex62 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,0,0,3,4,5,0,0,0,3,3,4,0,7,6,5};
        int count=0;
        int counter=0;
        for (int i=0;i<arr.length;i++){
            while (arr[i]==0){
                count++;
                i++;
            }
            if (count>counter)counter=count;
            count=0;
        }
        System.out.println(counter);
    }
}
