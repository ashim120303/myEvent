package RegEvent;

import java.text.ParseException;
import java.util.List;

public class TermEv {
    private int ko;
    public TermEv() throws ParseException {
        if (BufEv.masMyEvent.size() > 0) {
            PrintSP printS = new PrintSP();
            printS.printS(); // Печать шапки
            int k = 0;
            for (int i = 0; i < BufEv.masMyEvent.size(); i++) {
                List s = List.of(BufEv.masMyEvent.get(i));
                PrintEv printEv = new PrintEv(s);
                k++;
            }
            printS.printP();//Печать карточек
            ko=0;
        } else ko = 1;
    }
    public int getKo(){return ko;}
}
