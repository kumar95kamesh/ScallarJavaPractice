package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public class L5_Vulture extends L5_BirdV4 implements L5_Flyable {
    L5_FlyHigh fh = new L5_FlyHigh();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.flyhigh();
    }
}