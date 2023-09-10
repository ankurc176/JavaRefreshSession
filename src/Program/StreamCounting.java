package Program;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCounting {

    public static void main(String[] args) {

        char ch = 'i';

        String str = "India is my Country";

        System.out.println(str.chars().filter(s -> s == ch).count());

        System.out.println(str.chars().
                mapToObj(s -> Character.toLowerCase((char)s)).
                filter(s -> s.toString().equalsIgnoreCase("i")).
                collect(Collectors.groupingBy(Character::toUpperCase,Collectors.counting())));


        List<Integer> num = List.of(1,2,3,4,5,6);

        System.out.println(num.stream().filter(s -> s%2 == 0).collect(Collectors.toList()));

                //collect(Collectors.groupingBy(c -> Character.toLowerCase((char)c),Collectors.counting())));
    }

}


