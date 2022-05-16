package pl.sda.main;

import pl.sda.services.ParcelLockerServices;

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

                menu = scanner.nextInt();


                switch (menu) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1: parcelLockerAdding();
                        break;



                }


            } while (true);
        }


        //#1
        public static void parcelLockerAdding(){
            System.out.println("Podaj ulicę");
            String ulica = scanner.next();

            System.out.println("Podaj miasto");
            String miasto = scanner.next();

            System.out.println("Podaj kod");
            String kod = scanner.next();

            String id = parcelLockerServices.addNewParcelLocker(ulica,miasto,kod);
            System.out.println("Pomyślnie dodano paczkomat o ID: " + id );


        }








}
