package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P2_ICICIBankAdapter implements P2_BankApi{

    P2_ICICIBankApi ic = new P2_ICICIBankApi();

    @Override
    public int checkBalance() {
        return ic.checkBalance();
    }

    @Override
    public void transferMoney(int money) {
        ic.setTransferAmount(money);
    }
}