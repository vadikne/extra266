

/**
 * Created by owner on 12.01.2018.
 * 147. Вычислить площадь правильного шестиугольника со стороной a,
 * используя подпрограмму вычисления площади треугольника.
 */
public class Ex147 {
    public static void main(String[] args) {
        int a=5;
        System.out.println(6*areaTriangle(a));
    }
    public static double areaTriangle(int a){
        double s=(Math.sqrt(3)*a*a/4);
        return s;
    }
}
