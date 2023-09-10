package AdapterDesignPattern.Main;

import AdapterDesignPattern.Adaptee.weightInPound;
import AdapterDesignPattern.Adaptee.weightInPoundForBabiesImple;
import AdapterDesignPattern.Adapter.weightInKgsImple;

public class MainClient {

    public static void main(String[] args) {

        weightInKgsImple weightInKgsImple = new weightInKgsImple(new weightInPoundForBabiesImple());

        System.out.println(weightInKgsImple.getWeightInKgs());

    }

}
