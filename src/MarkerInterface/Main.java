package MarkerInterface;

class DiscountUtils {

    public boolean IsDiscountEligible(Object obj) {

        if(obj instanceof DiscountInter) {
            return true;
        }
        return false;
    }

}

public class Main {

    public static void main(String[] args) {



        PremiumEmp p = new PremiumEmp();
        StandardEmp s = new StandardEmp();

        DiscountUtils utils = new DiscountUtils();

        boolean value = utils.IsDiscountEligible(p);
        boolean value1 = utils.IsDiscountEligible(s);

        System.out.println(value);
        System.out.println(value1);



    }


}
