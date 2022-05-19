package pl.sda.main;

import pl.sda.model.parcel_locker.ParcelLocker;
import pl.sda.services.ParcelLockerServices;

import java.util.List;
import java.util.Scanner;

public class ParcelLockerMain {


        private static ParcelLockerServices parcelLockerServices = new ParcelLockerServices();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {


            int menu = 0;
            do {
                System.out.println("Wybierz co chcesz zrobić: ");
                System.out.println("0. - Wyjście");
                System.out.println("1. - Dodanie paczkomatu");
                System.out.println("2. - Usunięcie paczkomatu");
                System.out.println("3. - Wyświetlenie wszystkich paczkomatów");

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
                System.out.println("Nie udało się usunąć oaczkomatu o ID: " + id);
            }
    }

    //#3
    public static void printParcelLockers(){
       parcelLockerServices.printParcelLocker();
    }








}
