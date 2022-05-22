package pl.sda.services;

import pl.sda.model.parcel.Parcel;
import pl.sda.model.parcel_locker.ParcelLocker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParcelServices extends ParcelLockerServices {

    private List<Parcel> parcels = new ArrayList<>();


    //#6
    public String addNewParcel(String weight, String sender, String recipient, String senderParcelLocker, String recipientParcelLocker) {
        Parcel parcel = new Parcel(weight, sender, recipient, senderParcelLocker, recipientParcelLocker);
        parcels.add(parcel);
        return parcel.getId();
    }


    //#7
    public boolean removeParcel(String id) {
        Parcel toRemove = null;
        for (Parcel parcel : parcels) {
            if (parcel.getId().equals(id)) {
                toRemove = parcel;
                break;
            }
        }
        if ((toRemove != null)) {
            parcelLockers.remove(toRemove);
            return true;
        }
        return false;
    }


}
