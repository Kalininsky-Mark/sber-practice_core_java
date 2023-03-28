package ru.sber.String;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import static java.time.LocalDate.*;


public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        LocalDate date1 = parse(str1);
        LocalDate date2 = parse(str2);
        while (!date1.equals(date2)){
            System.out.println(date1);
            date1 = date1.plus(1, ChronoUnit.DAYS);
        }
        System.out.println(date2);
    }
}
