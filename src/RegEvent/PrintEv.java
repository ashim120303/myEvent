package RegEvent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class PrintEv {
    public PrintEv(List s) throws ParseException {
        System.out.print("\n| " + s.get(0) + "\t | ");
        if ((s.get(1).toString()).length()>8) {
            System.out.print(s.get(1) + "\t| ");
        } else if((s.get(1).toString()).length()<5) {
            System.out.print(s.get(1)+"\t\t\t| ");
        } else System.out.print(s.get(1) + "\t\t| ");
        System.out.print(s.get(2) + "\t| ");
        System.out.print(s.get(3));
        if (s.get(3).equals("Was")) {
            System.out.print("\t| ");
            System.out.print(s.get(4) + "\t|");
        } else {
            System.out.print("\t| ");
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            var newFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            Date date = format.parse(s.get(4).toString());
            System.out.print(newFormat.format(date).toString() + "\t|");
        }
    }
}
