package AdapterDesignPattern.Adaptee;

public class weightInPoundForBabiesImple implements weightInPound{

    @Override
    public double getWeightInPounds() {
        double valuePound = 90;
        return valuePound;
    }
}
