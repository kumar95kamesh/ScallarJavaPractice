package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public class L6_Sparrow extends L6_BirdV5 implements L6_Flyable {

    L6_FlyingBehaviour fl = new L6_FlyLow();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fl.makeFly();
    }
}