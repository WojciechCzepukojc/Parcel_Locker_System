package pl.sda.services;

import pl.sda.model.parcel_locker.Adress;
import pl.sda.model.parcel_locker.ParcelLocker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ParcelLockerServices {

   private List<ParcelLocker> parcelLockers = new ArrayList<>();

   //#1
public String addNewParcelLocker(String ulica, String miasto, String kod){
   Adress adress = new Adress(ulica, miasto, kod);
   ParcelLocker parcelLocker = new ParcelLocker(adress);
   parcelLockers.add(parcelLocker);
   return parcelLocker.getID();
}







}
