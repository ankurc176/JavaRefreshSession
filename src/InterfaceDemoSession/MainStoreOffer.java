package InterfaceDemoSession;

public class MainStoreOffer {

    public static void main(String[] args) {

        Store sp = new Store();
        Customer c1 = new Customer("Himmat");
        Customer c2 = new Customer("Harsh");

        sp.register(c1);
        sp.register(c2);

        sp.inviteMail();

    }
}
