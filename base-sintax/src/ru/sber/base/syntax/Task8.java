package ru.sber.base.syntax;
import java.util.Objects;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        System.out.println("��� ��� �����: �����, �������, � ����� � ��������� ����� �������?");
        String s;
        for (int i=1; i<=3;i++){
            s = user_input.nextLine();
            if (Objects.equals(s, "����������")){
                System.out.println("���������!");
                break;
            }else{
                if(Objects.equals(s, "������")) {
                    System.out.println("���������� �����: ����������");
                    break;
                }else{
                    if(i!=3) {
                        System.out.println("������� ���");
                    }
                }
            }
        }
    }
}
