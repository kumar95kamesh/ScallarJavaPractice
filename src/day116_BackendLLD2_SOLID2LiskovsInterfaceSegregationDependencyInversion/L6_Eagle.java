package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public class L6_Eagle extends L6_BirdV5 implements L5_Flyable {

    private L6_FlyingBehaviour fh;

    L6_Eagle(L6_FlyingBehaviour fh){
        this.fh = fh;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.makeFly();
    }
}