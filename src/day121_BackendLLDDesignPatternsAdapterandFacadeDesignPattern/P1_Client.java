package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

public class P1_Client {
    public static void main(String[] args) {
        P1_PhonePe ph = new P1_PhonePe();
        ph.checkLoanEligibility();
    }
}