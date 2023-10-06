package Exception;

public class ParentException {



}

class Parent {

    void m1() {
        int a = 5;
        int b = a/0;
    }

}

class ChildClass extends Parent {

    @Override
    void m1() {
        int a = 5;
        int b = a/0;
    }
}
