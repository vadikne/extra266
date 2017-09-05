import java.util.Arrays;

/**
 * 65. Найти длину самой длинной "пилообразной" (зубьями вверх)
 * последовательности подряд идущих чисел Xk < Xk+1 > Xk+2 > ... > Xk+m < Xk+m+1 <...< Xn.

 */
public class Ex65 {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5,4,1,2,3,4,5,6,5,4,5};
        System.out.println(Arrays.toString(arr));
      //  Ex1.fillRandomArray(arr);
        boolean up;
        boolean down;
        int max=arr[0];
        int min=arr[0];
        int counter=0;
        int maxCounter=0;
        int indUp;
        int indDown;
        for (int i=0;i<arr.length;i++){
            up=true;
            down=true;
            counter=1;
            max=0;

            while (up && i<arr.length-1){
                if (arr[i]>max){
                    max=arr[i];
                    counter++;
                    System.out.println(arr[i]+" "+i);
                    i++;
                }
                else {
                    up=false;
                }
            }
            min=max;

            while (down && i<arr.length-1){
                if (arr[i]<min){
                    min=arr[i];
                    counter++;
                    System.out.println(arr[i]);
                    i++;
                }
                else {
                    down=false;
                    }
            }
            if(!up&&!down)i--; //в конце нисходящей посл-ти последний элемент явл. первым следующего цикла
            //System.out.println(counter);
            if (maxCounter<counter)maxCounter=counter;


        }
        System.out.println("max ="+maxCounter);
    }
}
