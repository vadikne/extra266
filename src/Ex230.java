import java.util.HashMap;
import java.util.Map;

/**
 * Created by owner on 20.03.2018.
 * 230. Результаты вступительных экзаменов представлены в виде списка из N
 * строк, в каждой строке которого записаны фамилия студента и отметки по
 * каждому из M экзаменов.Определить количество абитуриентов,
 * сдавших вступительные экзамены: а) только на "отлично"; б) на "хорошо" и "отлично".
 */
public class Ex230 {
    public static void main(String[] args) {
        String [][] arr =   {{"Иванов","отл","хор","уд"},
                            {"Петров","отл","отл","отл"},
                            {"Сидоров","отл","хор","хор"},
                            {"Кузнецов","отл","хор","хор"}};
        boolean otl = true;
        boolean otlAndHor = true;
        Map<String,Integer> map = new HashMap<>();
        map.put("отл",0);
        map.put("хор",0);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (!arr[i][j].equals("отл"))otl=false;
                if (!arr[i][j].equals("отл") && (!arr[i][j].equals("хор")))otlAndHor=false;


            }
            if (otl){
                Integer tmp =map.get("отл");
                map.put("отл",++tmp);
            }
            if (otlAndHor && !otl){
                Integer tmp =map.get("хор");
                map.put("хор",++tmp);
            }
            otl=true;
            otlAndHor = true;
        }
        System.out.println("отличников: " +map.get("отл"));
        System.out.println("хорошистов: " +map.get("хор"));
    }
}
