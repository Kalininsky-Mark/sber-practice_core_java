package ru.sber.String;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        while (true){
            String str2 = in.next();
            pref pr = new pref() ;
            str1 = pref.prefix(str1,str2);
            System.out.println(str1);
        }
    }
}
