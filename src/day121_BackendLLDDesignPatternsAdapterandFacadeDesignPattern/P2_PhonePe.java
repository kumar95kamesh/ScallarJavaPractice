package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P2_PhonePe {
//    YesBankAPI yb = new YesBankAPI();
    P2_BankApi bi;
    P2_PhonePeLoan pl = new P2_PhonePeLoan();
    P2_FastTagRecharge ft = new P2_FastTagRecharge();

    P2_PhonePe(P2_BankApi bi){
        this.bi = bi;
    }

    boolean checkLoanEligibility(){
        return pl.LoanCheck(bi);
    }

    boolean FastTagRecharge(int amount){
        if(ft.recharge(bi,amount)>=0){
            System.out.println("Recharge SuccessFull");
            return true;
        }else{
            return false;
        }
    }

}