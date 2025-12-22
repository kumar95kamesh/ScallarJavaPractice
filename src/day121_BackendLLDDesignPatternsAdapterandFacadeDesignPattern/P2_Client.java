package day121_BackendLLDDesignPatternsAdapterandFacadeDesignPattern;

import java.util.Scanner;

public class P2_Client {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String bankName = scn.nextLine();
        P2_BankApi bi = P2_BankAPIFactory.getBankAPI(bankName);
        P2_PhonePe ph = new P2_PhonePe(bi);
        ph.checkLoanEligibility();
    }
}