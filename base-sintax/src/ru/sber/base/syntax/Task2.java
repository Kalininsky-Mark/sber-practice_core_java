package ru.sber.base.syntax;

public class Task2 {
    public static void quickSort(int[] arr, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int mid = arr[(leftMarker + rightMarker) / 2];
        do {
            while (arr[leftMarker] < mid) {
                leftMarker++;
            }
            while (arr[rightMarker] > mid) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                int tmp = arr[leftMarker];
                arr[leftMarker] = arr[rightMarker];
                arr[rightMarker] = tmp;
                leftMarker++;
                rightMarker--;
            }
        }while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(arr, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(arr, leftBorder, rightMarker);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 1;
        arr[2] = 160;
        arr[3] = 150;
        arr[4] = 200;
        quickSort(arr,0,4);
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
            System.out.println("");
        }
    }
}