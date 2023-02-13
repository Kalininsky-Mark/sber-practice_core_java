package ru.sber.base.syntax;

public class Task4 {
    public static void main(String[] args) {
        int max = 10;
        double[] arr = new double[max];
        for (int i=0; i<=max-1;i++){
            arr[i]=Math.random();
        }
        double mid;
        mid = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            mid+= arr[i];
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(arr[arr.length-1]);
        System.out.println(mid/ arr.length);
    }
}
