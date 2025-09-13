package day122_BackendLLDDesignPatternsDecoratorandFlyweightDesign;

public abstract class AddOn implements Beverage{
    Beverage b;

    AddOn(Beverage b){
        this.b = b;
    }
}