package TheatreProblem;

public class Main {
    public static void main(String[] args) {
        int numOfRows=5;
        int seatPerRows=2;
        int lastRow='A'+(numOfRows-1);
        System.out.println(lastRow);
        for (char row='A';row<=lastRow;row++) {
            for (int seat=1;seat<=seatPerRows;seat++) {
                System.out.println(row+String.format("%02d",seat));
            }
        }
    }
}
