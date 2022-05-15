package pl.sda.services;

import pl.sda.model.parcel_locker.ParcelLocker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParcelLockerServices {

    List<ParcelLocker> parcelLockers = new ArrayList<>();


    //#1
    public Stream<ParcelLocker> createID(String miasto){
        int i =1;
       return parcelLockers.stream()
                .filter(p-> p.getAdress().getMiasto().equals(miasto));
//todo


    }





}
