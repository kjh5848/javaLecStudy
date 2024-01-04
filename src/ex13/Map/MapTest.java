package ex13.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("김", "1234");
        map.put("박", "pass");
        map.put("이", "word");

        System.out.println(map.get("이"));

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key= " + key + ", value=" + value);

        }
        map.remove("이 ");
        map.put("최", "password");
        System.out.println(map);
    }
}
