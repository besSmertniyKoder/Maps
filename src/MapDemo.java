import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("alice", 20);//добавление
        map.put("bob", 19);
        map.put("charlie", 25);

        int a = map.get("bob");//получение

        boolean bool = map.containsKey("bob");
        System.out.println("присутсвует ли боб: " + bool);
        map.remove("alice");
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("name " + entry.getKey() + "  age is "
                    + entry.getValue());

        }
        System.out.println("завершение программы");



        System.out.println("///////////////");
        System.out.println(map.getOrDefault("bob", 4210));
        System.out.println(map.get("alice"));

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("zoey", 30);
        treeMap.put("peter", 26);
        treeMap.put("alice", 20);
        System.out.println(treeMap);

    }

}
