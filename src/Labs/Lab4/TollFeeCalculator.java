package Lab4;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class TollFeeCalculator {

    public TollFeeCalculator(String inputFile) {
        try {
            Scanner sc = new Scanner(new File(inputFile));
            String[] dateStrings = sc.nextLine().split(", ");
            LocalDateTime[] dates = new LocalDateTime[dateStrings.length]; //tog bort -1 för den tog inte hela arrayen.
            for(int i = 0; i < dates.length; i++) {
                dates[i] = LocalDateTime.parse(dateStrings[i], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            }

            System.out.println("The total fee for the inputfile is " + getTotalFeeCost(dates));
        } catch (DateTimeParseException e) {
            System.err.println("DateTimeParseException: Could not parse the file.... check file format.");
        } catch (IOException e) {
            System.err.println("Could not read file " + inputFile);
        }
    }

    private int getTotalFeeCost(LocalDateTime[] dates) {
        int totalFee = 0;
        int totalFeeDay=0;
        LocalDateTime intervalStart;
        //om första tid är tullfri så ska den inte använda den som första datum
        if (getTollFeePerPassing(dates[0]) == 0) {
            intervalStart = dates[1];
        } else {
            intervalStart = dates[0];
        }
        for(LocalDateTime date: dates) {
            long diffInMinutes = intervalStart.until(date, ChronoUnit.MINUTES);
            System.out.println(); //mellanslag bara för snyggare formatering i terminalen.
            //Om ny dag
            if (date.getDayOfWeek().getValue() != intervalStart.getDayOfWeek().getValue()) {
                System.out.println("==============================");
                System.out.println("Total daysum: " + totalFeeDay);
                System.out.println("==============================");
                //totalfeeday max 60.
                if (totalFee >= 60) {
                    totalFee += 60;
                } else {
                    totalFee += totalFeeDay;
                }
                totalFeeDay = 0;
                intervalStart = date;
                System.out.println();
                System.out.println("--------------- New Day ---------------");
            }

            System.out.println(date.toString());
            if (diffInMinutes > 60 && !date.equals(intervalStart) && !isTollFreeDate(date)) {
                totalFeeDay += getTollFeePerPassing(date);
                intervalStart = date;
                System.out.println("Passage cost: " + (getTollFeePerPassing(date)));
            } else if (diffInMinutes < 60 && !date.equals(intervalStart) || isTollFreeDate(date)) {
                if (date.getDayOfWeek().getValue() == 6 || date.getDayOfWeek().getValue() == 7) {
                    System.out.println("Tollfree passage due to tollfree day.");
                } else if (date.getMonth().getValue() == 7) {
                    System.out.println("Tollfree passage due to tollfree month.");
                } else if (diffInMinutes < 0 ) {
                    System.out.println("Tollfree passage");
                } else {
                    System.out.println("Tollefree since 60minutes window");
                }
            } else {
                if (!date.equals(intervalStart)) {
                    //Tar bort minsta tullen och lägger till den högsta.
                   totalFeeDay -= Math.min(getTollFeePerPassing(date), getTollFeePerPassing(intervalStart));
                }
                totalFeeDay += Math.max(getTollFeePerPassing(date), getTollFeePerPassing(intervalStart));
                System.out.println("Passage cost: " + Math.max(getTollFeePerPassing(date), getTollFeePerPassing(intervalStart)));
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Total daysum: " + totalFeeDay);
        System.out.println();
        return totalFee;
    }

    private int getTollFeePerPassing(LocalDateTime date) {
        if (isTollFreeDate(date)) return 0;
        int hour = date.getHour();
        int minute = date.getMinute();

        if (hour == 6 && minute <= 29) return 8;
        else if (hour == 6) return 13;
        else if (hour == 7) return 18;
        else if (hour == 8 && minute <= 29) return 13;
        else if (hour == 8 || hour >= 9 && hour <= 14) return 8; //fel i koden tog bara 30->59m täckte inte t.ex 14:02.
        else if (hour == 15 && minute <= 29) return 13;
        else if (hour >= 15 && hour <= 16 ) return 18; //felaktig kod hour = 16, minute <=59
        else if (hour == 17) return 13;
        else if (hour == 18 && minute <= 29) return 8;
        else return 0;
    }

    private boolean isTollFreeDate(LocalDateTime date) {
        return date.getDayOfWeek().getValue() == 6 || date.getDayOfWeek().getValue() == 7 || date.getMonth().getValue() == 7;
    }

    public static void main(String[] args) {
        //new TollFeeCalculator("src/Lab4/datumifelordning.txt");
        //new TollFeeCalculator("src/Lab4/januarimassapassagerunder60min.txt");
        //new TollFeeCalculator("src/Lab4/julifrimånad.txt");
        //new TollFeeCalculator("src/Lab4/Lab4.txt");
        //new TollFeeCalculator("src/Lab4/söndagspassager.txt");
        //new TollFeeCalculator("src/Lab4/tredatumiföljdmedsammatider.txt");
        //new TollFeeCalculator("src/Lab4/gustavsproblem.txt");
        new TollFeeCalculator("src/Lab4/jessicatest.txt");

        //Klara

        /* Från labpm:
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
        /*
        juli gratis månad = 0.
        test1 = veckodag 7, då är det fridag.
         */
        /* Januari:
        2020-01-01 06:34, 13
        2020-01-01 07:33, 18 (06:34-07:33 = 59m)
        2020-01-01 08:32, 26
        2020-01-01 09:31, 26 (08:32 - 09:31 = 59m)
        2020-01-01 10:30, 34
        2020-01-01 11:29, 34 (10:30 - 11:29 = 59m)          Totalt:55
        2020-01-01 12:28, 42
        2020-01-01 13:27, 42 (12:28 - 13:27 = 59m)
        2020-01-01 14:26, 50
        2020-01-01 15:25, 55 (14:26 - 15:25 = 59m) */
        /* Lab4.txt
        2020-06-30 00:05, 0kr
        2020-06-30 06:34, 13kr
        2020-06-30 08:52, 21 8
        2020-06-30 10:13, 29 8
        2020-06-30 10:25, 29 0
        2020-06-30 11:04, 29 0
        2020-06-30 16:50, 29 18 (47)
        2020-06-30 18:00, 55 8
        2020-06-30 21:30, 55 0
        2020-07-01 00:00  55 0
        */
    }
}