package RegEvent;

import java.io.IOException;

public class WrPeriod {
    private String begPeriod;
    private String endPeriod;
    public WrPeriod() throws IOException{
        System.out.print("Enter the start of the period (in the form of dd-mm-yyyy) - ");
        ReadDate readDate = new ReadDate();
        begPeriod = readDate.getNewDate();
        System.out.print("Enter the end of the period (in the form of dd-mm-yyyy) - ");
        readDate = new ReadDate();
        endPeriod = readDate.getNewDate();
    }
    public String getBegPeriod(){ return begPeriod;}
    public String getEndPeriod(){ return endPeriod;}
}
