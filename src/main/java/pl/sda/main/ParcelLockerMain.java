package pl.sda.main;

import pl.sda.model.parcel_locker.ParcelLocker;
import pl.sda.services.ParcelLockerServices;
import pl.sda.services.ParcelServices;

import java.util.List;
import java.util.Scanner;

public class ParcelLockerMain {


        private static ParcelLockerServices parcelLockerServices = new ParcelLockerServices();
        private static ParcelServices parcelServices = new ParcelServices();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {


            int menu = 0;
            do {
                System.out.println("Wybierz co chcesz zrobić: ");
                System.out.println("0. - Wyjście");
                System.out.println("1. - Dodanie nowego paczkomatu");
                System.out.println("2. - Usunięcie paczkomatu");
                System.out.println("3. - Wyświetlanie wszystkich paczkomatów");
                System.out.println("4. - Wyświetlanie wszystkich paczkomatów w wybranym mieście");
                System.out.println("5. - Zmiana danych adresowych istniejącego paczkomatu");
                System.out.println("6. - Dodanie nowej paczki");
                System.out.println("7. - Usunięcie paczki");

                menu = scanner.nextInt();


                switch (menu) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1: parcelLockerAdding();
                        break;
                    case 2: removeParcelLockerFromList();
                        break;
                    case 3: printParcelLockers();
                        break;
                    case 4: displayParcelLockersInTheCity();
                        break;
                    case 5: settingNewAdressToPackerLocker();
                        break;
                    case 6: addingNewParcel();
                        break;
                    case 7: parcelRemove();
                        break;



                }


            } while (true);
        }


        //#1
        public static void parcelLockerAdding(){
            System.out.println("Podaj ulicę");
            String street = scanner.next();

            System.out.println("Podaj miasto");
            String city = scanner.next();

            System.out.println("Podaj kod");
            String zipCode = scanner.next();

            String id = parcelLockerServices.addNewParcelLocker(street, city, zipCode);
            System.out.println("Pomyślnie dodano paczkomat o ID: " + id );

        }

    //#2
    public static void removeParcelLockerFromList(){
        System.out.println("Podaj ID paczkomatu który chcesz usunąć");
            String id = scanner.next();
            boolean result = parcelLockerServices.removeParcelLocker(id);
            if (result){
                System.out.println("Paczkomat o ID: " + id + " został poprawnie usunięty");
            }else {
                System.out.println("Nie udało się usunąć paczkomatu o ID: " + id);
            }
    }

    //#3
    public static void printParcelLockers(){
       parcelLockerServices.printParcelLocker();
    }


    //#4
    public static void displayParcelLockersInTheCity(){
        System.out.println("Podaj miejscowość");
        String city = scanner.next();
        parcelLockerServices.showParcelLockersInTheCity(city);

    }

    //#5
    public static void settingNewAdressToPackerLocker(){

        System.out.println("Podaj ID paczkomatu");
        String id = scanner.next();

        System.out.println("Podaj nową nazwę ulicy");
        String street = scanner.next();

        System.out.println("Podaj nową miejscowość");
        String city = scanner.next();

        System.out.println("Podaj nowy kod kreskowy");
        String zip = scanner.next();

        parcelLockerServices.setNewAdessData(id, street, city,zip);
    }

    //#6
    public static void addingNewParcel(){
        System.out.println("Podaj symbol oznaczający wagę paczki :" +
                "A - do 1kg " +
                "B - do 5kg " +
                "C - do 15kg " +
                "D - powyżej 15kg");
        String weight = scanner.next();

        System.out.println("Wprowadź nadawcę");
        String sender = scanner.next();

        System.out.println("Wprowadź odbiorcę");
        String recipient = scanner.next();

        System.out.println("Podaj ID paczkomatu nadawcy");
        String senderPL = scanner.next();

        System.out.println("Podaj ID paczkomatu odbiorcy");
        String recipientPL = scanner.next();

        String id = parcelServices.addNewParcel(weight, sender,recipient,senderPL,recipientPL);
        System.out.println("Pomyślnie dodano paczkę o ID " + id);
    }
    //#7
    public static void parcelRemove(){
        System.out.println("Podaj ID paczki którą chcesz usunąć");
        String id = scanner.next();
        boolean result = parcelServices.removeParcel(id);
        if (result){
            System.out.println("Paczka o ID: " + id + " została poprawnie usunięta");
        }else {
            System.out.println("Nie udało się usunąć paczki o ID: " + id);
        }
    }








}
