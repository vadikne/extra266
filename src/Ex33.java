import java.util.Arrays;

/**
 * 33. В массиве целых чисел с количеством элементов n найти
 * наиболее часто встречающееся число. Если таких чисел несколько,
 * то определить наименьшее из них.

 */
public class Ex33 {
    public static void main(String[] args) {
        int arr[][] = new int[30][2];
            for (int i = 0; i < arr.length; i++) {
            arr[i][0] = (int) (Math.random() * 10);
                }

        for (int i=0;i<arr.length;i++){ //считаем частоту
                int counter=0;
                int tmpNum=arr[i][0];
                for(int j=i;j<arr.length;j++){
                    if (arr[j][0]==tmpNum)counter++;
                }
                arr[i][1]=counter;
        }
        printArr(arr);
        int maxCount=0; // ищем лидеров по частоте
        int minOfMult=arr[0][0];
        for (int i=0;i<arr.length;i++){
            if(maxCount<arr[i][1]){maxCount=arr[i][1];
            minOfMult=arr[i][0];
        }
        }
        System.out.println(maxCount);

        for (int i=0;i<arr.length;i++){ // минимальное среди одинаковых лидеров
            if(arr[i][1]==maxCount && minOfMult>arr[i][0])minOfMult=arr[i][0];
        }
        System.out.println("искомое число "+minOfMult);

   }

    public static void printArr(int arr[][]){
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}





