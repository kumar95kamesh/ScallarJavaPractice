package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P1_YesBankAPI {
    public int getBalance(){
        return 100;
    }

    public void moneyTransfer(){
        System.out.println("Money is transferred via Yes Bank!");
    }
}