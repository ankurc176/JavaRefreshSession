package Program;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamInterview {

    static String name="XYZ";

    StreamInterview(String name) {
        this.name=name;
    }

    public static void main(String[] args) {

        ArrayList<Integer> integers = (ArrayList<Integer>) Arrays.asList(1,2,3,4,5,6);

        Iterator iterator = integers.iterator();

        StreamInterview ob = new StreamInterview("VVV");
        System.out.println(ob.name);

        List<String> list = List.of("apple", "banana", "pear", "grape");

        //Output => 4=[pear], 5=[apple,grape], 6=[banana]

        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(s -> s.length(), Collectors.toList()));

        System.out.println(collect);

        //Input = ["Hello"," ","World"]
        //Output = HelloWorld

        List<String> list1 = List.of("Hello"," ","World");

        System.out.println(list1.stream().collect(Collectors.joining()));

        Integer arr[] = new Integer[5];
        arr[0]=1;

        main(arr);

    }

    public static void main(Integer[] args) {

        System.out.println("Test");

    }


}
