package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public class L5_Pigeon extends L5_BirdV4 implements L5_Flyable {

    L5_FlyLow fl = new L5_FlyLow();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fl.flyLow();
    }
}