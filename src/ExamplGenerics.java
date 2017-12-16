/**
 * Created by owner on 04.12.2017.
 */
public class ExamplGenerics {
    public static void main(String[] args)  {
SomeClass <String> some = new SomeClass<>();
        some.setT("йцукен");
        System.out.println(some.getT());

    }
    static class SomeClass <T>{
        T t;

        public T getT() {
            return t;
        }
        public void setT(T t) {
            this.t = t;
        }
    }
}
