package Program;


import java.util.*;
import java.util.stream.Collectors;

public class FunctionalInterImple {

    public static void main(String[] args) {

        FunctionalInterface1 fun = () -> System.out.println("Himmat");
        fun.show();

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("ABC", 100);
        hashMap.put("EFG", 200);
        hashMap.put("HIJ", 300);
        hashMap.put("KLM", 400);

        System.out.println(hashMap);

        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(100);
        integers.add(200);
        integers.add(300);
        integers.add(400);

        List<Integer> readOnly = Collections.unmodifiableList(integers);

        //System.out.println(readOnly.add(700));

        Collections.sort(integers);



    }
}
