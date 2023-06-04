import RegEvent.*;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("+------------------+");
        System.out.println("|  Event register  |");
        System.out.println("+------------------+");
        ContrFile contrFile = new ContrFile();
        if (!contrFile.getKo()) { // Проверка на наличие БД
            System.out.println("File " + BufEv.path + " absent");
            System.exit(1);
        }
        while(true) {
            Mode mode=new Mode(); // Вывод номера режима
            int n=mode.getN(); // Чтение номера режима
            switch(n){
                case 1:
                    RegEv rehEv = new RegEv(); // Режим ввод-регистрация событий
                    WrEv wrEv = new WrEv(); // Запись на ВУ
                    break;
                case 2:
                    ReadMas readMas = new ReadMas(); // Чтение базы в массив
                    TermEv readEv =new TermEv();
                    break;
                case 3:
                    readMas = new ReadMas(); //Чтение базы в память
                    RequestEv requestEv = new RequestEv(); //Ввод номера запроса
                    if(requestEv.getVar()==BufEv.endReq) break; //Выход из запроса
                    Request request = new Request(requestEv.getVar()); //Обработка запроса по номеру
                    break;
                case 4:
                    PrintHelp printHelp = new PrintHelp(0, 4); //Спаравка
                    printHelp.printTop(); //Печать топиков справки
                    break;
                case 5:
                    System.out.println("End of work");
                    System.exit (0); // Выход из программы
                default:
                    System.out.println("Invalid mode number");
                    break;
            }
        }
    }
}