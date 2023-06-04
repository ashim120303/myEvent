package RegEvent;
import java.util.Scanner;

public class RequestEv {
    private int var;
    public RequestEv() {
        PrintModReq printModReq = new PrintModReq(); // Печать названий запростов
        while (true) {
            System.out.print("Define the request option (to exit, press " + BufEv.endReq+"): - ");
            Scanner cin = new Scanner(System.in);
            if (cin.hasNextInt()){
                var = cin.nextInt();
                switch (var) {
                    case 1: return;
                    case 2: return;
                    case 3: return;
                    case 4: return;
                    case 5:
                        PrintHelp printHelp = new PrintHelp(4, 4);
                        printHelp.printTop();
                        continue;
                    case 6: return;
                    default:
                        System.out.println("Variant error. Repeat the input.");
                        continue;
                }
            }else System.out.println("You didn't enter a number");
        }
    }
    public int getVar(){ return var;}
}
