package RegEvent;

import java.util.Scanner;

public class Mode {
    private int nMOde;

    public int getnMOde() {
        return nMOde;
    }

    public Mode(){
        System.out.print("\n");
        for(int i=0; i<BufEv.endMode; i++){
            System.out.print(i+1+") "+BufEv.textMode[i]+" ");
        }
        System.out.print("\n" + "Enter the mode number - ");
        while (true) {
            Scanner cin = new Scanner(System.in);
            if (cin.hasNextInt()) {
                int n = cin.nextInt();
                if (n>=1 && n<=BufEv.endMode) {nMOde=n; break;}
                else System.out.print("Mode number from 1 to " + BufEv.endMode+". Repeat the input - ");
            }else System.out.println("You didn't enter the number");
        }
    }
    public int getN() {return nMOde;}
}
