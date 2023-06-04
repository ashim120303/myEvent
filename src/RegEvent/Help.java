package RegEvent;

import java.util.ArrayList;
import java.util.List;

public class Help {
    protected int nTop;
    protected int endTop;
    protected List<String[]> textHelp = new ArrayList<>();
    private String[] topic0 = new String[]{"APPLICATION PURPOSE",
            " ",
            "The MyEvent application is designed for entering and viewing user events.",
            "Events are understood as a limited set of actions, such as: study, sports,",
            "recreation, friends, etc. For each event , the following is specified:",
            " 1. The date of its entry,",
            " 2. Appointment,",
            " 3. Time spent on the event,",
            " 4. State (was and will be)",
            " 5. Date of execution of the event to which the state <Will>"};
    private String[] topic1 = new String[]{"APPLICATION FUNCTIONS",
            " ",
            "The MyEvent application implements the following functions:",
            " 1. Entering event data,",
            " 2. Writing data to a text file (usually on a USB stick),",
            " 3. Viewing the entered data,",
            " 4. Execution of queries such as <How many hours spent on the event <Rest>, etc.>",
            " 5. Viewing Help"};
    private String[] topic2 = new String[]{"ENTERING EVENT DATA",
            " ",
            "The following events are provided in the application: Study, Road, Entertainment, Internet",
            " Sports, Friends, Food, Etc.",
            " For each event , enter:",
            " 1. The current calendar date in the form of dd-mm-yyyy,",
            " 2. Event name,",
            " 3. Time spent in hours (comma delimiter),",
            " 4. State (was or will be)",
            " 5. The date for the state <Will> in the form dd-mm-yyyy",
            "All data can be added to a file. At the moment, this is a file myEvent.txt on a flash drive.",
            "Editing of the entered data is not provided yet.",
    };
    private String[] topic3 = new String[]{"VIEWING THE ENTERED DATA",
            " ",
            "In this mode, data is read from the file myEvent.txt and output to the screen in the form of:",
            "   +---------------------------------------------------------------+",
            "   |  Date             Event         Time    Status    Date of " +
            "                                                         completion|",
            "   +---------------------------------------------------------------+",
            "   | 16-06-2022       |Study        | 5.0 |   Was   | 16-06-2022  |"};
    private String[] topic4 = new String[]{"EXECUTING REQUESTS",
            "The application provides the following database queries:",
            " ",
            "The MyEvent application implements the following functions:",
            " 1. The time spent on the event for the period,",
            " 2. Maximum time spent on an event for a period,",
            " 3. Minimum time spent on an event for a period,",
            " 4. What events are waiting for us after the entered date",
            " ",
            "IN MODE 1, the time spent on the specified event for the specified period is calculated.",
            "           If the period is not specified, then the calculation goes for all events. The result is displayed on the screen.",
            "In MODE 2, the maximum time for the specified event is determined. If the period is not specified,",
            "           then the calculation is carried out for all events. The result is displayed on the screen.",
            "IN MODE 3, the minimum time spent on the event is determined. If the period is not specified,",
            "           then the calculation is carried out for all events. The result is displayed on the screen.",
            "In MODE 4, all future events for the specified period are displayed on the screen. If the period is not specified,",
            "           then all events with the following status are displayed on the screen <Will be>."};

    public Help(int nTop, int endTop) {
        this.nTop=nTop;
        this.endTop=endTop;
        textHelp.add(topic0);
        textHelp.add(topic1);
        textHelp.add(topic2);
        textHelp.add(topic3);
        textHelp.add(topic4);
    }
    public void printTop(){};
}
