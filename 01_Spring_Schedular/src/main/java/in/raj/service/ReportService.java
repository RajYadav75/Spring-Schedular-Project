package in.raj.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
/*
    0 * * * * *: Runs the task at the start of every minute.

    0 0 * * * *: Runs the task at the start of every hour.

    0 0 12 * * *: Runs the task at 12:00 PM (noon) every day.

     0 0 8-18 * * *: Runs the task every hour between 8 AM and 6 PM.

    0 0 0 1 * *: Runs the task at midnight on the first day of every month.

     0 0 0 * * 1: Runs the task at midnight on every Sunday.

    Minute (0 - 59): Specifies the minute at which the task should execute.

    Hour (0 - 23): Specifies the hour of the day at which the task should execute.

     Day of the month (1 - 31): Specifies the day of the month at which the task should execute.

    Month (1 - 12): Specifies the month of the year at which the task should execute.

     Day of the week (0 - 7): Specifies the day of the week at which the task should execute. Both 0 and 7 represent Sunday.

    Year (optional): Specifies the year in which the task should execute.
*/
//    @Scheduled(fixedRate = 3000)
//    @Scheduled(cron = "* * * * * *")
//    @Scheduled(cron = "0/5 * * * * *")
    @Scheduled(cron = "1 * * * * *")
    public void generateReport() {
        System.out.println("Report generated");
    }
}