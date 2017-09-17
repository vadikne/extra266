import java.util.Arrays;

/**
 * 71. Заданы два одномерных массива с различным количеством
 * элементов и натуральное число k. Объединить их в один массив,
 * включив второй массив между k-м и (k+1)-м элементами первого,
 * не используя дополнительный массив.

 */
public class Ex71 {
    public static void main(String[] args) {
        int k=3;
        int [] arr=new int[30];
        for (int i=0;i<20;i++)arr[i]=(int)(Math.random()*100);
        System.out.println(Arrays.toString(arr));
        int brr []={1,1,1,1,1};

        int quantityOfSecondPart;
        int quatityOfZero=arr.length-lastEmptyFromEnd(arr);

        quantityOfSecondPart=arr.length-quatityOfZero-k;

        int j=0;
        for(int i=k;i<k+brr.length;i++){
            moveOnOne(arr,quantityOfSecondPart);
            arr[i]=brr[j++];
        }
        System.out.println(Arrays.toString(arr));
    }
   public static int lastEmptyFromEnd(int[]array){
        int n=array.length-1;

        for (int i=array.length-1;i>0;i--) if (array[i]!=0){
            n=i+1;
            break;
        }
            return n;
   }

    public static int[] moveOnOne(int[]array,int quantity){
        for (int i=lastEmptyFromEnd(array);i>=lastEmptyFromEnd(array)-quantity;i--){
            array[i]=array[i-1];
            array[i-1]=0;
        }

        return array;
    }
}
