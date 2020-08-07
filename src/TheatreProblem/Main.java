package TheatreProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       Theatre theatre=new Theatre("PVR Cinemas",10,12);
       //theatre.getSeats();
       if (theatre.reserveSeat("I11")) {
           System.out.println("Please pay for the seat");
       }
       else {
           System.out.println("Sorry, Seat already taken");
       }
        if (theatre.reserveSeat("I11")) {
            System.out.println("Please pay for the seat");
        }
        else {
            System.out.println("Sorry, Seat already taken");
        }
        if (theatre.reserveSeat("D13")) {
            System.out.println("Please pay for the seat");
        }
        else {
            System.out.println("Sorry, Seat already taken");
        }
        List<Theatre.Seat> reverseSeat=new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printList(reverseSeat);

        List<Theatre.Seat> priceSeat=new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat("B00",13.00));
        priceSeat.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeat,Theatre.PRICE_ORDER);
        printList(priceSeat);


    }
    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat:list) {
            System.out.print(" " +seat.getSeatNumber() +" $"+seat.getPrice());
        }
        System.out.println();

    }
}
