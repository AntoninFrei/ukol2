package com.engeto.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*Evidence rezervaci*/
public class Reservation {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Room reservedRoom;
    private List<Guest> guestsInReservation = new ArrayList<>();

    public Reservation(LocalDate checkIn, LocalDate checkOut, Room reservedRoom,  List<Guest> guestsInReservation){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.reservedRoom = reservedRoom;
        this.guestsInReservation = guestsInReservation;

    }

    public Reservation(Room reservedRoom,  List<Guest> guestsInReservation) {
        this.checkIn = LocalDate.now();
        this.checkOut = this.checkIn.plusDays(6);
        this.reservedRoom = reservedRoom;
        this.guestsInReservation = guestsInReservation;
        }

    public void printReservation() {
        System.out.printf("Příjezd: \t\t\t%s%nOdjezd: \t\t\t%s%n",
                this.checkIn,this.checkOut);
        System.out.printf("Pokoj:\t\t\t\t%d%n", this.reservedRoom.getNo());
        System.out.println("Hosté v rezervaci:");
        for(int i=0; i < guestsInReservation.size(); i++) {
            System.out.printf("\t\t%s%n", guestsInReservation.get(i).getFullName());
        }
        System.out.printf("---------%n%n");



    }
}
