package ru.sber.base.syntax;

public class Task7 {
    public static void main(String[] args) {
        int num1,num2, tmp;
        num1 = 0;
        num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        for(int i = 3; i<=11;i++){
            tmp = num2;
            num2 = num2+num1;
            num1 = tmp;
            System.out.println(num2);
        }
    }
}
