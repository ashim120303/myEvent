package RegEvent;

import java.io.IOException;
public class RegEv {
    public RegEv() throws IOException{
        // Чтение текущей даты
        DateReg dateReg = new DateReg();
        // Наименование события
        ReadNameEv readNameEv = new ReadNameEv(true);
        // Время на событие
        WrTimeEv wrTimeEv = new WrTimeEv();
        // Состояние события (было, будет)
        SosEv sosEv = new SosEv();
        //Ввод даты для будущих событий
        if (BufEv.nameSos.equals("Will")) {
            FutureDate futureDate = new FutureDate();
        }
        else{
            BufEv.futureDate = BufEv.currDate;
        }
    }
}