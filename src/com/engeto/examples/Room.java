package com.engeto.examples;

/*Evidence pokoju*/
public class Room {
    int No;
    int NoOfBed;
    boolean viewToSee;
    boolean withBalcony;
    double price;

    public Room(int No, int NoOfBed, boolean viewToSee, boolean withBalcony, double price) {
        this.No = No;
        this.NoOfBed = NoOfBed;
        this.viewToSee = viewToSee;
        this.withBalcony = withBalcony;
        this.price = price;
    }
    public void printDescription() {
        System.out.printf("Pokoj č.: \t\t\t%d%nPočet lůžek: \t\t%d%n",
                this.No, this.NoOfBed);

        System.out.printf("Výhled na moře: \t%s%n", getStringFromBoolen(this.viewToSee));

        System.out.printf("Balkón: \t\t\t%s%n", getStringFromBoolen(this.withBalcony));

        System.out.printf("Cena : \t\t\t\t%.2f Kč%n---------%n%n",
                this.price);
    }

    public int getNo() {

        return this.No;
    }
    /*Vraci Ano=true, Ne=false*/
    public String getStringFromBoolen(boolean Bol) {
        if(Bol){
            return "Ano";

        }
        else {
            return "Ne";
        }

    }




}
