//*4. Дана последовательность действительных чисел a1, a2, ..., an. Выяснить, будет ли она возрастающей.

public class Ex4 {
    public static void main(String[] args) {
int [] arr = {1,2,3,4,5,6,7,8,9};
for (int i=1; i<arr.length;i++){
    if (arr[i]<=arr[i-1]) {
        System.out.println("нет - "+i);
        break;
       }
    else if(i==arr.length-1) System.out.println("yes -"+ i);
}
    }
}
