package ru.sber.String;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.LocalDate.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        DateTimeFormatter shortRU = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(parse(str1, shortRU).getYear()- parse(str2, shortRU).getYear());
    }
}
