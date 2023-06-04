package RegEvent;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class PrintEvReq {
    private int ko;
    private double sum;
    double max = 0;
    double min = 999999999;

    public PrintEvReq(int var, String beg, String end, String name) throws ParseException {
        if (BufEv.masMyEvent.size() == 0) {
            ko = 1;
            return;
        }
        PrintSP printSP = new PrintSP();
        if (var == 4) printSP.printS(); // Печать шапки
        printStr(var, beg, end, name); // Обработка и печать всех  строк базы или по запросу
        if (var == 4) printSP.printP(); // Печать карточек
        else printE(var, name); // Печать результатов запросов 1,2,3
    }

    void printE(int var, String name) {
        switch (var) {
            case (1):
                System.out.println("To the event <" + name + "> time spent  = " + sum + " hour.");
                break;
            case (2):
                System.out.println("To the event <" + name + "> maximum time spent = " + max + " hour.");
                break;
            case (3):
                System.out.println("To the event < " + name + "> minimum time spent = " +
                        (min = min == 999999999 ? 0 : min) + (" hour."));
                break;
            default:
                break;
        }
    }
    void printStr(int var, String beg, String end, String name) throws ParseException{
        for (int i = 0; i < BufEv.masMyEvent.size(); i++) {
            List s = List.of(BufEv.masMyEvent.get(i)); // Очередную i-я строка пишем в s
            DateFormat formatOld = new SimpleDateFormat("dd-MM-yyyy"); // Наш формат
            DateFormat formatNew = new SimpleDateFormat("yyyyMMdd"); // амер. форммат
            // Перевод даты из базы в число
            int iBD;
            if (var == 4) {
                iBD = Integer.parseInt(formatNew.format(formatOld.parse(s.get(4).toString())));
            } else {
                iBD = Integer.parseInt(formatNew.format(formatOld.parse(s.get(0).toString())));
            }
            int iBeg, iEnd;
            boolean w;
            if (beg==null) iBeg =0;
            else iBeg = Integer.parseInt(formatNew.format(formatOld.parse(beg)));
            if (end == null) iEnd = 99990000;
            else iEnd = Integer.parseInt(formatNew.format(formatOld.parse(end)));
            if (var >= 4)
                w = (iBD >= iBeg && iBD <= iEnd) && s.get(3).equals("Will");
            else
                w = (iBD >= iBeg && iBD <= iEnd) && (s.get(1).equals(name)) && (s.get(3).equals("Was"));
            if (w) {
                if (var == 4) {
                    PrintEv printEv = new PrintEv(s);
                }
                sum += Double.parseDouble(s.get(2).toString());
                if (Double.parseDouble(s.get(2).toString()) > max) max = Double.parseDouble(s.get(2).toString());
                if (Double.parseDouble(s.get(2).toString()) < min) min = Double.parseDouble(s.get(2).toString());
            } else continue;
        }
    }
    public int getKo(){ return ko;}
}
