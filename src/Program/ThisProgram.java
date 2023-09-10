package Program;

class A {
    int x = 10;


    public void method() {
        System.out.println("Hello" + this.x);
    }

}

public class ThisProgram extends A{

    int x = 5;

    public void method () {
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {

        A a = new ThisProgram();
        a.method();

    }

}

//class Amount {
//    public Amount(String currency, int amount) {
//        this.currency = currency;
//        this.amount = amount; }
//    String currency;// Should be an Enum
//    int amount;// Should ideally use BigDecimal }
//
//class AmountAdder {
//    static Amount addAmounts(Amount amount1, Amount amount2) {
//        if (!amount1.currency.equals(amount2.currency)) {
//            throw new NullPointerException("Currencies don't match");
//        }
//        return new Amount(amount1.currency, amount1.amount + amount2.amount); }
//}
