package Program;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SecondHighestArray {

    public static void main(String[] args) {

        int arr[] = {3,2,-2,5,-3};

        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0; j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
            }
        }

        int highest = arr[0];

        System.out.println("Elements of an array");

        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
            }

        int secondHighest = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]<highest) {
                secondHighest=arr[i];
                System.out.println("Second Highest Element of an array = "+arr[i]);
                break;
            }
        }

        for (int i=0;i<arr.length;i++) {
            if (arr[i]<secondHighest) {
                System.out.println("Third Highest Element of an array = "+arr[i]);
                break;
            }
        }
    }
}
