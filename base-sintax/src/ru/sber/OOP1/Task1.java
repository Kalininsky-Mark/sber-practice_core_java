package ru.sber.OOP1;

public class Task1 {
    public static void main(String[] args){
        String[] arr = new String[5];
        arr[0]= "8(888)888-88-80";
        arr[1]= "8(888)888-88-81";
        arr[2]= "8(888)888-88-82";
        arr[3]= "8(888)888-88-83";
        arr[4]= "8(888)888-88-84";
        Phone phone = new Phone("8(888)888-88-88","Nokia3310",113); // ����� ������������ � 3-�� �����������
//        Phone phone = new Phone("8(888)888-88-81","Nokia3310"); //����� ������������ ��� ���������� ����
//        Phone phone = new Phone();   //����� ������� ������������
        System.out.println(phone.toString());
        System.out.println(phone.getNumber());
        phone.receiveCall("����");
        phone.receiveCall2("����","8(888)888-88-88");   // ����� ������ receiveCall � ����� �����������
        phone.sendMessage(arr);
    }
}
