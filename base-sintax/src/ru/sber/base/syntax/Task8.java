package ru.sber.base.syntax;
import java.util.Objects;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String s;
        for (int i=1; i<=3;i++){
            s = user_input.nextLine();
            if (Objects.equals(s, "Троллейбус")){
                System.out.println("Правильно!");
                break;
            }else{
                if(Objects.equals(s, "Сдаюсь")) {
                    System.out.println("Правильный ответ: троллейбус");
                    break;
                }else{
                    if(i!=3) {
                        System.out.println("Подумай ещё");
                    }
                }
            }
        }
    }
}
