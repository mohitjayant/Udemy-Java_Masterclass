package TheatreProblem;

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
    }
}
