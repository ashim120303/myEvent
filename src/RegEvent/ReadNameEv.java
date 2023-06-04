package RegEvent;
import java.util.Scanner;

public class ReadNameEv {
    public ReadNameEv(boolean b) {
        if (b) {
            System.out.println("Enter the event name number:");
            DirEnum[] dirEnum = DirEnum.values();
            for (int i = 0; i < dirEnum.length; i++) {
                System.out.print(i + 1 + ") " + dirEnum[i] + " ");
            }
            System.out.print("\n" + "-");
            while (true) {
                Scanner cin = new Scanner(System.in);
                if (cin.hasNextInt()) {
                    int n = cin.nextInt();
                    if (n >= 1 && n <= DirEnum.values().length) {
                        BufEv.nDirEnum = n;
                        BufEv.nameEv = dirEnum[n - 1].toString();
                        break;
                    } else System.out.print("Number from 1 to " + DirEnum.values().length + ". Repeat the input - ");
                } else System.out.println("You didn't enter a number");
            }
        } else BufEv.nameEv = null;
    }
}
