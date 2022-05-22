package pl.sda.services;

import pl.sda.model.parcel.Parcel;

import java.util.ArrayList;
import java.util.List;

public class ParcelServices extends ParcelLockerServices{

    private List<Parcel> parcels = new ArrayList<>();

    //#6
    public String addNewParcel(String weight, String sender, String recipient, String senderParcelLocker, String recipientParcelLocker ){
        Parcel parcel = new Parcel(weight, sender, recipient, senderParcelLocker, recipientParcelLocker);
        parcels.add(parcel);
        return parcel.getId();
    }



}
