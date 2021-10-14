package com.engeto.examples;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) {
        List<Guest> Guests = new ArrayList<>();
        Guests.add(new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 15)));
        Guests.add(new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));

        System.out.println("Výpis registrovaných hostů:");
        for(int i=0; i < Guests.size(); i++) {
            Guests.get(i).printDescription();
        }
        List<Room> Rooms = new ArrayList<>();
        Rooms.add(new Room(1, 1, true, true, 1000));
        Rooms.add(new Room(2, 1, true, true, 1000));
        Rooms.add(new Room(3, 3, true, false, 2400));

        System.out.println("Výpis pokojů:");
        for(int i=0; i < Rooms.size(); i++) {
            Rooms.get(i).printDescription();
        }
        List<Guest> guestInReservation1 = new ArrayList<>();
        guestInReservation1.add(Guests.get(0));

        List<Reservation> Reservations = new ArrayList<>();
        Reservations.add(new Reservation(LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), Rooms.get(0), guestInReservation1));

        List<Guest> guestInReservation2 = new ArrayList<>();
        guestInReservation2.add(Guests.get(0));
        guestInReservation2.add(Guests.get(1));
        Reservations.add(new Reservation(LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), Rooms.get(2), guestInReservation2));

        List<Guest> guestInReservation3 = new ArrayList<>();
        guestInReservation3.add(Guests.get(0));
        guestInReservation3.add(Guests.get(1));
        Reservations.add(new Reservation(Rooms.get(2), guestInReservation3));

        System.out.println("Výpis rezervací:");
        for(int i=0; i < Reservations.size(); i++) {
            Reservations.get(i).printReservation();
        }
    }
}
