package Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EpamTest {

    //Array = [3,2,5,-2,-3] ==> Result will be the largest value from array with K and -K values, 3

    //[5,3,2,-2,-3],

    public static int largestValue(int [] Arr) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<Arr.length;i++) {

            hashMap.put(Arr[i],1);
        }
        int count=0;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i=0;i<Arr.length;i++) {

            if (hashMap.containsKey(-1*Arr[i]) && hashMap.get(-1*Arr[i])==1) {

                //System.out.println(-Arr[i]+" "+Arr[i]);
                hashMap.put(Arr[i],0);
                hashMap.put(-1*Arr[i],0);
                integers.add(Arr[i]);
            }

        }
        Collections.reverseOrder();
        return integers.get(0);

    }

    public static void main(String[] args) {

        int A[] = {5,3,2,-2,-3,-5};
        System.out.println(largestValue(A));

    }


}
