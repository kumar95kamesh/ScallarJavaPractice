package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P2_ICICIBankApi {

    P2_ICICIBankApi(){

    }

    int transferAmount = 0;
    public int checkBalance(){
        return 100;
    }

    public void TransferMoney(){
        System.out.println("Money is transferred via Yes Bank!");
    }

    public void setTransferAmount(int amount){
        transferAmount = amount;
    }
}