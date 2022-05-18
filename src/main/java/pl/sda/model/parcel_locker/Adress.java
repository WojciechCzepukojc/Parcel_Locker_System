package pl.sda.model.parcel_locker;


import java.util.NoSuchElementException;

public class Adress {

    private String street;
    private String city;
    private String zipCode;

    public Adress(String street, String city, String zipCode) {
        this.street = isValidStreet(street);
        this.city = isValidCity(city);
        this.zipCode = isZipCodeValid(zipCode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    private String isValidStreet(String ulica) {
        if (ulica != null && ulica.length() >= 3
                && !ulica.toLowerCase().equals(ulica)
                && !ulica.toUpperCase().equals(ulica)) {
            return ulica;
        } else {
            throw new NoSuchElementException("Podano błędną  nazwę ulicy");
        }


    }

    private String isValidCity(String city) {
        if (city != null && city.length() >= 3
                && !city.toLowerCase().equals(city)
                && !city.toUpperCase().equals(city)) {
            return city;
        } else {
            throw new NoSuchElementException("Podano błędną nazwę miasta");
        }
    }

    private String isZipCodeValid(String zip) {
        String reg = "\\d{2}(-\\d{3})?";
        if (zip.matches(reg)) {
            return zip;
        } else {
            throw new NoSuchElementException("Podano błędny ZIPCode");
        }
    }

}
