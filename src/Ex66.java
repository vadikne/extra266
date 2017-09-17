/**
 * 66. Дан массив А. Найти отрезок массива максимальной длины,
 * в котором первое число равно последнему, второе – предпоследнему
 * и т.д. Вывести этот отрезок и его длину.

 */
public class Ex66 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,2,3,4,3,2,4,5,6,7,6,5,4,9,0};
        int count=1;
        int lineSize=0;
        int maxCount=0;
        int index1=0;
        int index2=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count=1;
                    for (int m=0;m<(j-i)/2;m++){
                        if ((i+m-(j-m))==1){
                            count++;
                            break;
                        }

                        if (arr[i+m]==arr[j-m])count++;
                        else {
                            count=1;
                            break;
                        }
                        System.out.println(arr[i+m]+"["+(i+m)+"] "+arr[j-m]+"["+(j-m)+"] ");
                    }
                    System.out.println();
                }
                if (count>maxCount){
                    maxCount=count;
                    System.out.println(maxCount);
                    index1=i;
                    index2=j;
                }
            }
        }
        System.out.println("длина отрезка="+(index2-index1+1)+" с первым элементом № "+index1);
    }
}
