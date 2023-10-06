package Program;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapImple {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);
        hashMap.put("D",4);

        Optional<String> optional = null;

        if (optional.isPresent()) {
        } else {
            System.out.println("TEST");
        }

        for (Map.Entry<String, Integer> values: hashMap.entrySet()) {
            System.out.println(values.getKey());
            System.out.println(values.getValue());
        }
    }
}
