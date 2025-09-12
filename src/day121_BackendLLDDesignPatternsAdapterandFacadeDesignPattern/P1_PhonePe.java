package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P1_PhonePe {
    P1_YesBankAPI yb = new P1_YesBankAPI();
    P1_PhonePeLoan pl = new P1_PhonePeLoan();
    P1_FastTagRecharge ft = new P1_FastTagRecharge();

    boolean checkLoanEligibility(){
        return pl.LoanCheck(yb);
    }

    boolean FastTagRecharge(int amount){
        if(ft.recharge(yb,amount)>=0){
            System.out.println("Recharge SuccessFull");
            return true;
        }else{
            return false;
        }
    }

}