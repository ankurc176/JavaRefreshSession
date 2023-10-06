package InfosysCoding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfEvenStream {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        //Sum of even numbers by using Java 8 Features.

        int sum = Arrays.stream(arr).filter(a->a%2==0).sum();

        System.out.println(sum);

        String ch = "India is my country";

        List<Character> cha = ch.chars().mapToObj(c -> Character.toLowerCase((char)c))
                .filter(c -> c.equals('i')).collect(Collectors.toList());

        Map<Character, Long> collect = ch.chars().mapToObj(c -> Character.toLowerCase((char) c))
                .filter(c -> c.equals('i'))
                .collect(Collectors.groupingBy(Character::toUpperCase, Collectors.counting()));
        System.out.println(collect);

        // count the occurrence of given word in the List

        List<String> words = Arrays.asList("apple", "banana", "apple", "mango", "apple");

        Map<String, Long> count = words.stream().filter(s -> s.equals("apple")).
                collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        System.out.println(count);

        try {
            FileInputStream inputStream = new FileInputStream("Output");
        } catch (FileNotFoundException e) {

        }

    }
}
