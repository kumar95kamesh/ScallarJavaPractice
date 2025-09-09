package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public class L6_Vulture extends L6_BirdV5 implements L6_Flyable {
    L6_FlyingBehaviour fh = new L6_FlyHigh();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.makeFly();
    }
}