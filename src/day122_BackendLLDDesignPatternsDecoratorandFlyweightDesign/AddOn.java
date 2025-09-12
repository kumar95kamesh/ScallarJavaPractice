package Decorator;

public interface Beverage {
    void getDesc();
    int getCost();
}package Decorator;

public abstract class AddOn implements Beverage{
    Beverage b;

    AddOn(Beverage b){
        this.b = b;
    }
}