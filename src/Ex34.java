import java.util.Arrays;

/**
 * 34. Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на 2 см,
 * а каждый пасмурный день опускается вниз на 1 см, В начале наблюдения улитка
 * находится в A см от земли на B-метровом дереве. Имеется 30-элементный массив,
 * содержащий сведения о том, был ли соответствующий день наблюдения пасмурным
 * или солнечным. Написать программу, определяющую местоположение улитки к концу 30-го дня наблюдения.

 */
public class Ex34 {
    public static void main(String[] args) {
        int a=5; //сантиметров
        int b=15;// метров
        int [] arr = new int[30];
        Ex1.fillRandomArray(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)arr[i]=0;
            else arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
        for (int c:arr
             ) {
            if(c==0)a--;
            else a+=2;
            if (a<0){
                System.out.println("Сползла");
                break;
            }
            else if(a>15*100){
                System.out.println("взлетела");
                break;
            }
            System.out.println(c+" Высота="+a);
        }
    }
}
