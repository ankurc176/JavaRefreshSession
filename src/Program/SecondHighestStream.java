package Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecondHighestStream {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(10);
        integers.add(1060);
        integers.add(120);
        integers.add(160);
        integers.add(100);
        integers.add(160);


        System.out.println(integers);

        System.out.println(integers.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).collect(Collectors.toList()));

        String str = "Himmat TCS";

        System.out.println(str.chars().mapToObj(c -> (Character.toLowerCase((char)c))).collect(Collectors.groupingBy(c->c,Collectors.counting())));

    }
}
