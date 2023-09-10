package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.weightInPound;

public class weightInKgsImple implements weightInKg {

    private weightInPound weightInPound;

    public weightInKgsImple(weightInPound weightInPound) {
        this.weightInPound = weightInPound;
    }

    @Override
    public double getWeightInKgs() {

        double valueInPounds = weightInPound.getWeightInPounds();
        double valueInKgs = valueInPounds *.45;
        return valueInKgs;
    }
}
