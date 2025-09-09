package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public abstract class L2_BirdV1 {

    void eat(){
        System.out.println("Eating");
    }

    abstract void fly();
    abstract void makeSound();

}
