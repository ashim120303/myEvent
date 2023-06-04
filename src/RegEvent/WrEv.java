package RegEvent;

import java.util.Scanner;

public class WrEv {
    public WrEv() {
        System.out.print("Writing an event to a file (1 or 0)? - ");
        Scanner cin = new Scanner(System.in);
        int otv = cin.nextInt();
        if (otv == 1) {
            ContrFile contrFile = new ContrFile(); // Проветка наличия файла
            if(contrFile.getKo()){WrStrEv wrStrEv = new WrStrEv();}//Запись в базу строку
            else{
                WrBegin wrBegin = new WrBegin(); // Пишем новый файл myEvent.txt
                WrStrEv wrStrEv=new WrStrEv();  // Пишем в базу строку
            }
        }
    }
}