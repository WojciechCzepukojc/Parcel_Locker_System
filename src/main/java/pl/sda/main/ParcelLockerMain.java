package pl.sda.main;

import pl.sda.services.ParcelLockerServices;

public class ParcelLockerMain {

    public static void main(String[] args) {

        ParcelLockerServices parcelLockerServices = new ParcelLockerServices();

        System.out.println(parcelLockerServices.createID("Miasto"));


    }
}
