package ru.sber.String;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        Pattern p = Pattern.compile(str2);
        Matcher m = p.matcher(str1);
        int c = 0;
        while (m.find()){
            c++;
        }
        System.out.println(c);
    }
}
