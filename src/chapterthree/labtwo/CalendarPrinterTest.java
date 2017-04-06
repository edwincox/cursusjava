package chapterthree.labtwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

    public class CalendarPrinterTest {

        private CalendarPrinter calendarPrinter;

        @Before
        public void setUp() {
            calendarPrinter = new CalendarPrinter();
        }

        @Test
        public void printThreeEventsPrintsAll() {
            LocalDate startDate = LocalDate.of(2016, Month.APRIL, 5);
            List<String> printedEvents = calendarPrinter.print(startDate, Arrays.asList("Building blocks", "Operators", "Core APIs"));
            Assert.assertEquals(3, printedEvents.size());
            Assert.assertEquals("05-04-2016: Building blocks", printedEvents.get(0));
            Assert.assertEquals("06-04-2016: Operators", printedEvents.get(1));
            Assert.assertEquals("07-04-2016: Core APIs", printedEvents.get(2));
        }
    }

