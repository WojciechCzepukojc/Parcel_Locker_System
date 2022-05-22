package pl.sda.model.parcel;

import pl.sda.model.parcel_locker.ParcelLocker;
import pl.sda.services.ParcelLockerServices;

import java.util.NoSuchElementException;

public class Parcel extends ParcelLockerServices {

    private String id;
    private String weight;
    private String sender;
    private String recipient;
    private String senderParcelLocker;
    private String recipientParcelLocker;
    private int counter = 1;

    public Parcel(String weight, String sender, String recipient, String senderParcelLocker, String recipientParcelLocker) {
        this.id = idMaker();
        this.weight = isWeightValid(weight);
        this.sender = isSenderValid(sender);
        this.recipient = isRecipientValid(recipient);
        this.senderParcelLocker = isParcelLockerExist(senderParcelLocker);
        this.recipientParcelLocker = isParcelLockerExist(recipientParcelLocker);
    }


    public String getId() {
        return id;
    }

    public String getWeight() {
        return weight;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSenderParcelLocker() {
        return senderParcelLocker;
    }

    public String getRecipientParcelLocker() {
        return recipientParcelLocker;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSenderParcelLocker(String senderParcelLocker) {
        this.senderParcelLocker = senderParcelLocker;
    }

    public void setRecipientParcelLocker(String recipintParcelLocker) {
        this.recipientParcelLocker = recipintParcelLocker;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id='" + id + '\'' +
                ", weight='" + weight + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", senderParcelLocker=" + senderParcelLocker +
                ", recipintParcelLocker=" + recipientParcelLocker +
                '}';
    }

    private String idMaker() {

        String a = "PAR";
        Integer x = counter++;
        return String.format(a + "%0" + 4 + "d", x);
    }

    private String isWeightValid(String weight) {
        if (weight.equals("A") || weight.equals("B") || weight.equals("C") || weight.equals("D")) {
            return weight;

        } else {
            throw new NoSuchElementException("Podano błędny symbol");
        }
    }

    private String isSenderValid(String sender) {
        if (sender != null && sender.length() >= 3) {
            return sender;
        } else {
            throw new NoSuchElementException("Podano błędną nazwę");
        }
    }

    private String isRecipientValid(String recipient) {
        if (recipient != null && recipient.length() >= 3) {
            return recipient;
        } else {
            throw new NoSuchElementException("Podano błędną nazwę");
        }
    }

    private String isParcelLockerExist(String id) {
        for (ParcelLocker parcelLocker : parcelLockers)
            if (parcelLocker.getID().equals(id)) {
                return parcelLocker.getID();
            } else {
                throw new NoSuchElementException("Podano błęde id");
            }
        return null;
    }


}
