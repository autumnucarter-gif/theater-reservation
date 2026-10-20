package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);


        System.out.println("Please enter you name: " );
        String name = myscanner.nextLine();


        System.out.println("What date will you be coming? (MMM/dd/yyyy) ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        LocalDate date = LocalDate.parse(myscanner.nextLine(), formatter);


        System.out.println("How many ticket would you like? ");
        int numberTickets = myscanner.nextInt();


        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

        myscanner.close();

        if (numberTickets > 1) {
            System.out.println(numberTickets + " tickets for " + date + " Under " + lastName + ", " + firstName);
        }else {
            System.out.println(numberTickets + " ticket for " + date + " Under " + lastName + ", " + firstName);

        }
    }
}
