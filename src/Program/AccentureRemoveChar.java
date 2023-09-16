package Program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class AccentureRemoveChar {

    public static void main(String[] args) {

        String str = "Himmat";
        //Output: loudTeh

        //1st Method
        String str2 = str.toLowerCase().replace("c","");
        System.out.println(str2);

        System.out.println(removeChar(str.toLowerCase(), 'm'));

    }

    public static String removeChar(String str, char ch) {

        String finalStr = "";
        for (int i = 0; i<str.length();i++) {

            if (str.charAt(i) != ch) {
                finalStr = finalStr+str.charAt(i);
            }
        }
        return finalStr;
    }

}
