package RegEvent;

import java.util.ArrayList;

public class BufEv {
    public static String path = "myEvent.txt"; // Путь к файлу.
    public static String header = "Program <MyEvent>. Authors Eminov, Zamonshoev, Kaliasova";
    public static ArrayList<String[]> masMyEvent = new ArrayList<String[]>(); // Массив для чтения событий
    public static String[] textMode={"Input", "View", "Request", "Help", "Exit"};//Опции меню
    public static int endMode = textMode.length; // колличество опций меню
    public static String currDate;
    public static String nameEv;
    public static int nDirEnum;
    public static String timeEv;
    public static String nameSos;
    public  static String futureDate;
    public static String[] textReq = {
        "1. The time spent on the event for the period",
        "2. Maximum time spent on an event for a period",
        "3. Minimum time spent on an event for a period",
        "4. What events are waiting for us after the entered date",
        "5. Help",
        "6. Exit"
    };
    public static int endReq = textReq.length;
}
