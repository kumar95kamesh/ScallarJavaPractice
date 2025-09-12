package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P1_FastTagRecharge {
    int recharge(P1_YesBankAPI yb,int amount){
        if(yb.getBalance()>=amount){
            System.out.println("Recharge Successfully");
            return 1;
        }

        return 0;
    }
}