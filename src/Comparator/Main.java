package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1,"Himmat"));
        studentList.add(new Student(2,"Harsh"));
        studentList.add(new Student(3,"Ajay"));
        studentList.add(new Student(4,"Vishal"));


        Collections.sort(studentList, new SortByName());

        System.out.println(studentList);

    }
}
