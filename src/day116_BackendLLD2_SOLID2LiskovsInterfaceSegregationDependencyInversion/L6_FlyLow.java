package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public class L6_FlyLow implements L6_FlyingBehaviour{

    @Override
    public void makeFly() {
        System.out.println("Flying Low");
    }
}