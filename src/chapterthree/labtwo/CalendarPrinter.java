package chapterthree.labtwo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by edwincox on 6-4-2017.
 */
public class CalendarPrinter {


    public List<String> print(LocalDate startDate, List<String> events) {

        LocalDate eventdate = startDate;

        List<String> eventBook = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for(String event : events) {
            String formattedEvent = eventdate.format(formatter) + ": " + event ;
            eventBook.add(formattedEvent);
            eventdate = eventdate.plusDays(1);
        }

        return eventBook;
    }
}


