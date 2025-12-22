package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P2_YesBankApiAdapter implements P2_BankApi {

    P2_YesBankAPI yb = new P2_YesBankAPI();

    @Override
    public int checkBalance() {
        return yb.getBalance();
    }

    @Override
    public void transferMoney(int money) {
        yb.moneyTransfer();
    }
}