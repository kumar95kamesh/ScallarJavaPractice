package day122_BackendLLDDesignPatternsDecoratorandFlyweightDesign;

public class DarkRoast implements Beverage{

    @Override
    public void getDesc() {
        System.out.println("Dark Roast : " + getCost());
    }

    @Override
    public int getCost() {
        return 150;
    }
}