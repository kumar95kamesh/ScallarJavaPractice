package day122_BackendLLDDesignPatternsDecoratorandFlyweightDesign;

public class Milk extends AddOn {
	
//	public Milk() {
//		
//	}
/**
 * This upper one default constructor can not be created because its default constructor will call its
 * parent class default constructor.. but its parent class doesn't have any default constructor so we 
 * will have to pass an object to it.
 * Important--> addon ko class isliye hi bnaya h.. otherwise interface bhi to bna skte the.. but 
 * agar interface bnate to wha to koi constructor tha nhi.. or milk class m parameterized constructor 
 * bnane ki koi jrurat nhi hoti.. fir to milk class ka bhi object bnaya ja skta tha.. or bina kisi 
 * main object k bhi addon ko order kr skte the... and it shouldn't happen.. main object me hi to addon hoga
 */
    public Milk (Beverage b){
        super(b);
    }

    @Override
    public void getDesc() {
        this.b.getDesc();
        System.out.println("Milk");//description updated
    }

    @Override
    public int getCost() {
        return this.b.getCost() + 2;//get the cost of existing beverage and add milk cost into that
    }
}