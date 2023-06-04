package RegEvent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadMas {
    private int ko;

    public ReadMas() {
        try {
            File file = new File(BufEv.path);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            //Считаем сначало первую строку
            String line = reader.readLine();
            if (line == null) {
                ko = 2;
                return;
            }
            MasBuf masBuf = new MasBuf(true);
            while (true) {
                // Считаем очередную строку в цикле
                line = reader.readLine();
                if (line != null) {
                    BufEv.currDate = line;
                    BufEv.nameEv = reader.readLine();
                    BufEv.timeEv = reader.readLine();
                    BufEv.nameSos = reader.readLine();
                    BufEv.futureDate = reader.readLine();

                    masBuf = new MasBuf(false);
                }
                else break;
            }
            fileReader.close();
            ko=0;
        }
        catch (IOException e){ko = 1;}
    }
    public int getKo(){return ko;}
}
