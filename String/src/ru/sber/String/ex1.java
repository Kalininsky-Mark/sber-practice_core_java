package ru.sber.String;
import java.util.Scanner;


public class ex1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str =  in.next();
        str = str.toLowerCase();
        int[] arr = new int[26];
        int i = 0;
        int j;
        String O = "a";
        int a = O.charAt(0);
        for (;i<str.length();i++){
            j = str.charAt(i);
            arr[j-a]++;
        }
        char ch;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                ch = (char) (i+a);
                System.out.print(ch);
                System.out.print(": ");
                System.out.println(arr[i]);
            }
        }
    }
}
