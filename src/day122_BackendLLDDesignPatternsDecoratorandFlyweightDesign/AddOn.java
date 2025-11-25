package day122_BackendLLDDesignPatternsDecoratorandFlyweightDesign;

public abstract class AddOn implements Beverage{
    Beverage b;//it means whatever comes under addons will have beverage properties

    AddOn(Beverage b){//so it will have beverage properties
        this.b = b;
    }
}