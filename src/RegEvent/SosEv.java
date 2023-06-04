package RegEvent;

import java.util.Scanner;

public class SosEv {
    public SosEv() {
        System.out.print("Enter the event state (0-was, 1-will) - ");
        while (true) {
            Scanner cin = new Scanner(System.in);
            if (cin.hasNextInt()) {
                int n = cin.nextInt();
                if (n == 0 || n == 1) {
                    BufEv.nameSos = n == 0 ? (String) "Was" : (String) "Will";
                    break;
                } else System.out.print("Status number number 0 or 1. Repeat the input - ");
            } else System.out.println("You didn't enter a number");
        }
    }
}
