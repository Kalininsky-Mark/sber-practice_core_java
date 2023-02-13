package ru.sber.base.syntax;

public class Task1 {
    public static void main(String[] args) {
        long[] arr = new long[5];
        arr[0] = 100;
        arr[1] = 1;
        arr[2] = 160;
        arr[3] = 150;
        arr[4] = 200;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    long tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
            System.out.println("");
        }
    }
}