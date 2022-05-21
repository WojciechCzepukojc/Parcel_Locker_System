package pl.sda.services;

import pl.sda.model.parcel_locker.Adress;
import pl.sda.model.parcel_locker.ParcelLocker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ParcelLockerServices {

    private List<ParcelLocker> parcelLockers = new ArrayList<>();

    //#1
    public String addNewParcelLocker(String street, String city, String zipCode) {
        Adress adress = new Adress(street, city, zipCode);
        ParcelLocker parcelLocker = new ParcelLocker(adress);
        parcelLockers.add(parcelLocker);
        return parcelLocker.getID();
    }


    //#2
    public boolean removeParcelLocker(String id) {
        ParcelLocker toRemove = null;
        for (ParcelLocker parcelLocker : parcelLockers) {
            if (parcelLocker.getID().equals(id)) {
                toRemove = parcelLocker;
                break;
            }
        }
        if ((toRemove != null)) {
            parcelLockers.remove(toRemove);
            return true;
        }
        return false;
    }

    //#3
    public void printParcelLocker() {
        int counter = 0;
        for (ParcelLocker parcelLocker : parcelLockers) {
            counter++;
            System.out.println(counter + ".- " + parcelLocker.getID() + " " + parcelLocker.getAdress().toString());
        }
    }
    //#4
    public void showParcelLockersInTheCity(String city){
        int counter = 0;
        for (ParcelLocker parcelLocker : parcelLockers){
            if (parcelLocker.getAdress().getCity().equals(city)){
                counter++;
                System.out.println(counter + ".- " + parcelLocker.getID() + " " + parcelLocker.getAdress().toString());
            }else {
                System.out.println("Brak paczkomatów w wybranej miejscowości");
            }
        }
    }
    //#5
    public void setNewAdessData( String id, String street, String city, String zip){
        ParcelLocker parcelLocker = getParcelLockerbyID(id);
        parcelLocker.getAdress().setStreet(street);
        parcelLocker.getAdress().setCity(city);
        parcelLocker.getAdress().setZipCode(zip);
    }


    //#5
    private ParcelLocker getParcelLockerbyID(String id){
       for (ParcelLocker parcelLocker:parcelLockers){
           if (parcelLocker.getID().equals(id))
               return  parcelLocker;
       }
       return null;
    }


    }












