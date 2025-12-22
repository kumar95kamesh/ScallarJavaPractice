package day122_BackendLLDDesignPatternsDecoratorandFlyweightDesign;


public class Client {
    public static void main(String[] args) {
        Beverage b = new DarkRoast();
        System.out.println(b.getCost());
        b = new Milk(b);//add milk
        System.out.println(b.getCost());
        b = new Milk(b);//again add milk
        System.out.println(b.getCost());
        b = new Mocha(b);//add mocha
        System.out.println(b.getCost());
    }
}