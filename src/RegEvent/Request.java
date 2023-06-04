package RegEvent;

import java.io.IOException;
import java.text.ParseException;

public class Request {
    public Request(int var) throws IOException, ParseException{
        var wrPeriod = new WrPeriod(); //Ввод периода
        String beg = wrPeriod.getBegPeriod();
        String end = wrPeriod.getEndPeriod();
        boolean b = var == 4? false:true;
        ReadNameEv nameEv = new ReadNameEv(b); //не запрашивать имя, или запрашивать
        String name = BufEv.nameEv;
        PrintEvReq printEvReq = new PrintEvReq(var, beg, end, name); // Печать по запросу
        if (printEvReq.getKo() != 0) System.out.println("Error reading from the database");
    }
}
