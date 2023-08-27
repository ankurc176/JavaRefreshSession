package InterfaceDemoSession;

public class Customer implements Member{

    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void callBack() {
        System.out.println("Hi "+name+"!!!, Please visit our Store for Offers");
    }
}
