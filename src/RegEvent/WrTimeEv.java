package RegEvent;

import java.util.Scanner;

public class WrTimeEv {
    public WrTimeEv() {
        System.out.println("Enter the time spent on the event (fractional number, through a point) - ");
        while (true) {
            Scanner cin = new Scanner(System.in);
            if (cin.hasNextDouble()) {
                BufEv.timeEv = String.valueOf(cin.nextDouble());
                break;
            } else {
                System.out.print("You did not enter a number, repeat the input - ");
                continue;
            }
        }
    }
}
