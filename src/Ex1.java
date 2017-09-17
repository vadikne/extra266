//1. Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.

import java.lang.reflect.Array;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        fillRandomArray(arr);
        int k = 3;
        int sumRes = 0;

       for (int i=0;i<arr.length; i++){
           if (arr[i]%k==0&&arr[i]!=0) {
               sumRes = sumRes + arr[i];
               System.out.println("i=" + i+ "  arr="+arr[i] + "   sum = " + sumRes);
           }
       }
    }
            public static int[] fillRandomArray ( int arr[]){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
            return arr;
        }
    }

