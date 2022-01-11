package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple", "QE", 125000, true, true, true, true);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "Captial One", "SM", 115000, true, true, false, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "BoA", "BA", 130000, true, false, true, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("====================================================================");

        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList( myOffers ) );
        fullTimeOffers.removeIf(p -> !p.isFullTime); //removes if the offer is not full time

        System.out.println("Full time Offers: ");
        System.out.println(fullTimeOffers.size());

        System.out.println("==================================================");

        ArrayList<Offer> localOffer = new ArrayList<>(Arrays.asList( myOffers ) );
        fullTimeOffers.removeIf(p -> !p.location.equals("TX")); // removes the offer that is not from the local area

        System.out.println("Local Offers: ");
        System.out.println(fullTimeOffers.size());

        System.out.println("======================================================");










    }


}
