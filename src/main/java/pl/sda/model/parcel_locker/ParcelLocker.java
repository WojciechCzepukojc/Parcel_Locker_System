package pl.sda.model.parcel_locker;

public class ParcelLocker {

    private static Integer counter = 1;

    Adress adress ;
    private Integer ID;


    public ParcelLocker(Adress adress) {
        this.adress = adress;
        this.ID = counter++;
    }

    public Integer getID() {
        return ID;
    }

    public Adress getAdress() {
        return adress;
    }
}
