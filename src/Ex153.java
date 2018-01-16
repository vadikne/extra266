/**
 * Created by owner on 15.01.2018.
 * 153. Даны числа X, Y, Z, T – длины сторон четырехугольника.
 * Вычислить его площадь, если угол между сторонами длиной X и Y – прямой.
 */
public class Ex153 {
    public static void main(String[] args) {
        int x= 3, y=4, z=7, t=8;
        int xY=(int)Math.sqrt(x*x+y*y);
        System.out.println(areaOfTriangle(x,y,xY)+areaOfTriangle(xY,z,t));

    }
public static double areaOfTriangle(int a, int b, int c){
    double p=((a+b+c)/2);
    double s=(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    return s;
}
}
