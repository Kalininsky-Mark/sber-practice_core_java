package ru.sber.String;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str =  in.next();
        str = str.toLowerCase();
        int[] arr = new int[26];
        int i = 0;
        int j;
        String O = "a";
        int a = O.charAt(0);
        char firstCh = '0';
        for (;i<str.length();i++){
            j = str.charAt(i);
            arr[j-a]++;
        }
        for (i=0;i<str.length();i++){
            j = str.charAt(i);
            if ( (firstCh == '0') && (arr[j-a]==1)){
                firstCh = str.charAt(i);
            }
        }
        System.out.print(firstCh);
    }

}
