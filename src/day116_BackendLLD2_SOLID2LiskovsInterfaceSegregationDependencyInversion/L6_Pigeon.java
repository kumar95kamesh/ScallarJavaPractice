package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public class L6_Pigeon extends L6_BirdV5 implements L6_Flyable {

    L6_FlyHigh fh;

    L6_Pigeon(L6_FlyHigh fh){
        this.fh  = fh;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.makeFly();
    }
}