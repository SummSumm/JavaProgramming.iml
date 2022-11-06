package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("LA", "Apple", "SDET", 120000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Amazon", "QA", 140000, true, true, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple", "QE", 130000, true, false, false, true);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "Capital", "SDET", 60000, false, false, true, false);

        Offer offer5 = new Offer();
        offer5.setInfo("DC", "BoA", "QA", 100000, false, true, true, true);

        Offer [] offers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList <Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        fullTimeOffers.removeIf(p -> !p.isFullTime); // eliminate all non-fulltimes
        fullTimeOffers.removeIf(p -> !p.isWFH); // eliminate all non work from homes

        System.out.println(fullTimeOffers);;


    }
}
