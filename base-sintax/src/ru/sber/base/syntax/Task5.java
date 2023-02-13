package ru.sber.base.syntax;

public class Task5 {
    public static void main(String[] args) {
        long dmax;
        long d;
        boolean prime;
        for (long i=2;i<100;i++){
            d = 2;
            prime = true;
            dmax = Math.round(Math.sqrt(i));
            while ((d<=dmax )&(prime)){
                prime = i % d !=0;
                d++;
            }
            if (prime){
                System.out.println(i);
            }
        }
    }
}
