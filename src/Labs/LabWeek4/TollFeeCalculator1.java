package Labs.LabWeek4;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/*
Hur det skall vara enligt lab pm
    2020-06-30 00:05, 0kr
    2020-06-30 06:34, 13kr           dvs 6/30 = 13+8+8+8+8+18+8 = 40+13+18 = 53+18 = 71 -> 60
    2020-06-30 08:52, 8kr
    2020-06-30 10:13, 8kr
    2020-06-30 10:25, 8kr
    2020-06-30 11:04, 8kr
    2020-06-30 16:50, 18kr
    2020-06-30 18:00, 8kr
    2020-06-30 21:30, 0kr
    2020-07-01 00:00  0kr
 */
/*
Från labpm:
Tider       Belopp
06:00–06:29 8 kr
06:30–06:59 13 kr
07:00–07:59 18 kr
08:00–08:29 13 kr
08:30–14:59 8 kr
15:00–15:29 13 kr
15:30–16:59 18 kr
17:00–17:59 13 kr
18:00–18:29 8 kr
18:30–05:59 0 kr
 */

public class TollFeeCalculator1 {
    public TollFeeCalculator1(String inputFile) {
        try {
            Scanner sc = new Scanner(new File(inputFile));
            String[] dateStrings = sc.nextLine().split(", ");
            LocalDateTime[] dates = new LocalDateTime[dateStrings.length-1];
            for(int i = 0; i < dates.length; i++) {
                dates[i] = LocalDateTime.parse(dateStrings[i], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            }
            System.out.println("The total fee for the inputfile is " + getTotalFeeCost(dates));
        } catch(IOException e) {
            System.err.println("Could not read file " + inputFile);
        }
    }

    private int getTotalFeeCost(LocalDateTime[] dates) {
        int totalFee = 0;
        LocalDateTime intervalStart = dates[0];
        for(LocalDateTime date: dates) {
            System.out.println(date.toString());
            long diffInMinutes = intervalStart.until(date, ChronoUnit.MINUTES);
            if(diffInMinutes > 60) {
                totalFee += getTollFeePerPassing(date);
                intervalStart = date;
            } else {
                totalFee += Math.max(getTollFeePerPassing(date), getTollFeePerPassing(intervalStart));
            }
        }
        return Math.min(totalFee, 60); //Ändrar för att den ska ta det minsta.
    }

    private int getTollFeePerPassing(LocalDateTime date) {
        if (isTollFreeDate(date)) return 0;
        int hour = date.getHour();
        int minute = date.getMinute();
        if (hour == 6 && minute >= 0 && minute <= 29) return 8;
        else if (hour == 6 && minute >= 30 && minute <= 59) return 13;
        else if (hour == 7 && minute >= 0 && minute <= 59) return 18;
        else if (hour == 8 && minute >= 0 && minute <= 29) return 13;
        else if (hour == 8 && minute >=30 && minute <=59 || hour >= 9 && hour <= 14 && minute >= 0 && minute <= 59) return 8; //Ändrade från 8.30 -> (9.00 -> 14.59)
        else if (hour == 15 && minute >= 0 && minute <= 29) return 13;
        else if (hour >= 15 && hour <= 16 && minute >= 30 && minute <= 59) return 18; //Ändrade argument så det stämmer.
        else if (hour == 17 && minute >= 0 && minute <= 59) return 13;
        else if (hour == 18 && minute >= 0 && minute <= 29) return 8;
        else return 0;
    }

    private boolean isTollFreeDate(LocalDateTime date) {
        return date.getDayOfWeek().getValue() == 6 || date.getDayOfWeek().getValue() == 7 || date.getMonth().getValue() == 7;
    }

    public static void main(String[] args) {
        new TollFeeCalculator1("src/txtfiler/Lab4.txt");
    }
}
