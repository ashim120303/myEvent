package RegEvent;

import java.util.List;
import java.util.Scanner;

public class PrintHelp extends Help{
    public PrintHelp(int nTop, int endTop) {
        super(nTop,endTop);
    }
    @Override
    public void printTop(){
        for (int i = nTop; i <=endTop; i++) {
            List s = List.of(textHelp.get(i));
            for(int j = 0;j<s.size();j++) System.out.println(s.get(j));
            if(nTop==endTop) return;
            else{
                System.out.print("To continue issuing help, click 'Enter', to finish 0 - ");
                Scanner cin = new Scanner(System.in);
                String otv = cin.nextLine();
                if(otv.equals("")) continue;
                else return;
            }
        }
    };
}
