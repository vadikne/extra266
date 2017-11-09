import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    public static void main(String ... args) {
        Map<String,String> hMap=new HashMap<>(20);
        hMap.put("q","a");
        System.out.println(hMap.size());
        System.out.println(hMap.get("q"));
    }
}
