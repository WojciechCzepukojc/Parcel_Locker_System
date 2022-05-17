package pl.sda.model.parcel_locker;


import java.util.NoSuchElementException;

public class Adress {

    private String ulica;
    private String miasto;
    private String kod;

    public Adress(String ulica, String miasto, String kod) {
        this.ulica = isValidStreet(ulica);
        this.miasto = isValidCity(miasto);
        this.kod = kod;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "ulica='" + ulica + '\'' +
                ", miasto='" + miasto + '\'' +
                ", kod='" + kod + '\'' +
                '}';
    }

    private String isValidStreet (String ulica){
        if (ulica != null && ulica.length() >3
                && !ulica.toLowerCase().equals(ulica)
                && !ulica.toUpperCase().equals(ulica)) {
            return ulica;
        }else{
            throw new NoSuchElementException("Podano błędną  nazwę ulicy");
        }


    }

    private String isValidCity (String city) {
        if (city != null && city.length() > 3
                && !city.toLowerCase().equals(city)
                && !city.toUpperCase().equals(city)) {
            return city;
        } else {
            throw new NoSuchElementException("Podano błędną nazwę miasta");
        }
    }

}
