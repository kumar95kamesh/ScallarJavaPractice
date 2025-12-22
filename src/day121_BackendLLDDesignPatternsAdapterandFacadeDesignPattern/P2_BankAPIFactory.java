package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P2_BankAPIFactory {
    public static P2_BankApi getBankAPI(String bankAPIName) {
        if(bankAPIName.equals("YesBank")) {
            return new P2_YesBankApiAdapter();
        } else if (bankAPIName.equals("ICICIBank")) {
            return new P2_ICICIBankAdapter();
        } else {
            throw new IllegalArgumentException("Your Bank is not available at the moment");
        }
    }
}