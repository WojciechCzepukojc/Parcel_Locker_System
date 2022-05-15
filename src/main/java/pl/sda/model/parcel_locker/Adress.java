package pl.sda.model.parcel_locker;


public class Adress {

    private String ulica;
    private String miasto;
    private String kod;

    public Adress(String ulica, String miasto, String kod) {
        this.ulica = ulica;
        this.miasto = miasto;
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
}
