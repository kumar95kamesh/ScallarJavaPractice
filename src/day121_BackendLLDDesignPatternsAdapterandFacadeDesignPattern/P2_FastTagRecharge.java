package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P2_FastTagRecharge {
    int recharge(P2_BankApi yb, int amount){
        if(yb.checkBalance()>=amount){
            System.out.println("Recharge Successfully");
            return 1;
        }

        return 0;
    }
}