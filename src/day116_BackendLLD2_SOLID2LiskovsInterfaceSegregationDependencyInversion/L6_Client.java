package day116_BackendLLD2_SOLID2LiskovsInterfaceSegregationDependencyInversion;

public class L6_Client {
    public static void main(String[] args) {
        L6_Eagle eagle = new L6_Eagle(new L6_FlyLow());

        eagle.fly();
    }
}