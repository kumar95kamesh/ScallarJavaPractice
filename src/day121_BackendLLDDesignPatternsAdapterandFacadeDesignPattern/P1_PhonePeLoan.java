package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P1_PhonePeLoan {
    public boolean LoanCheck(P1_YesBankAPI yb){
        if(yb.getBalance()>100){
            return true;
        }

        return false;
    }
}