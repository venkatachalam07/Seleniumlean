

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class javamethod {

    public static void main(String[] args) {
        String dateStr = "21-Mar-2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("The date " + dateStr + " falls on a: " + dayOfWeek);
    }
            }





//
//
//                LocalDate currentDate = LocalDate.now();
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//                String formattedDate = currentDate.format(formatter);
//                System.out.println("Current Date: " + formattedDate);
//                LocalDate nextDate = currentDate.plusDays(1);
//                DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//                String formattedNextDate = nextDate.format(formatterr);
//                System.out.println("  formatterr Next Date: " + formattedNextDate);
//            }
//        }




