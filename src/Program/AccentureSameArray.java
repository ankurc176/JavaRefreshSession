package Program;

import java.util.Arrays;

public class AccentureSameArray {


    public static void main(String[] args) {

        int arr[] = {3,2,5,7,1,20,90};
        int arr1[] = {2,7,3,1,5,20,50};

        //Arr size should be same and both array should contain same elements.

        //sameArrayCheck(arr,arr1);
        boolean flag = sameArrayCheckVideo(arr,arr1);

        if (flag) {
            System.out.println("ARRAY EQUAL");
        } else {
            System.out.println("ARRAY NOT EQUAL");
        }

    }
    public static void sameArrayCheck(int[] arr, int[] arr1) {

        int num[] = new int[50];  //because digits 0-9

        //Add 1 to the num[] array with respect to the value present in the arr[] array
        for (int i=0;i<arr.length;i++){
            num[arr[i]] = 1;
        }

        //Remove 1 from the num[] array with respect to the value present in the arr1[] array
        for (int j=0;j<arr1.length;j++) {
            num[arr1[j]] = num[arr1[j]]-1;
        }

        //Check if after removing the 1 from num[] array have 0 values for all the digits
        int a = 0;
        for (int k=0;k<10;k++) {
            if (num[k] == 0 ) {
                a++;
            }
        }
        if (a == 10) {
            System.out.println("ARRAY EQUAL");
        }
        else {
            System.out.println("ARRAY NOT EQUAL");
        }
    }

    public static boolean sameArrayCheckVideo(int arr[], int arr1[]) {

        int len1 = arr.length;
        int len2 = arr1.length;

        Arrays.sort(arr);
        Arrays.sort(arr1);

        for (int j=0;j<len1;j++) {
            System.out.println(arr[j]);
        }

        if (len1 != len2) {
            return false;
        }

        for (int i=0; i<len1;i++) {
            if(arr[i] != arr1[i]) {
                return false;
            }
        }
        return true;
    }
}


