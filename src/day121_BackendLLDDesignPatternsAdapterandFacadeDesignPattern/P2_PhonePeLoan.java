package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P2_PhonePeLoan {
    public boolean LoanCheck(P2_BankApi yb){
        if(yb.checkBalance()>100){
            return true;
        }

        return false;
    }
}