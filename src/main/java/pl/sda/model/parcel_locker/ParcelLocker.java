package pl.sda.model.parcel_locker;

import java.util.Locale;

public class ParcelLocker {

    private static Integer counter = 1;

    private Adress adress ;
    private String ID;


    public ParcelLocker(Adress adress) {
        this.adress = adress;
        this.ID = iDMaker();
    }

    public String getID() {
        return ID;
    }

    public Adress getAdress() {
        return adress;
    }


    //#1
    public String iDMaker(){
        String id = makeCityShortcut() + paddingZeros();
        return id;
    }


    //#1
    private String makeCityShortcut(){

        String a = adress.getMiasto();
        String b = a.substring(0,3).toUpperCase();
        return b;
    }

    //#1
    private static String paddingZeros() {

        Integer x = counter++;

        return String.format("%0" + 3 + "d", x);


    }
}
