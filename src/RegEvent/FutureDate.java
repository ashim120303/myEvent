package RegEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FutureDate {
    public FutureDate() throws IOException {
        System.err.print("Enter the end date of the event as dd-MM-yyyy - ");
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String tempDate = reader.readLine();
            SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
            try {
                Date date = form.parse(tempDate);
                if (form.format(date).equals(tempDate)) {
                    BufEv.futureDate=tempDate;
                    break;
                }
                else System.err.println("Date error. Repeat the input - ");
            }
            catch (ParseException e){System.err.println("Date error. Repeat the input - ");}
        }
    }
}
