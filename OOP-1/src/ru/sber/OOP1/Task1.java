package ru.sber.OOP1;

public class Task1 {
    public static void main(String[] args){
        String[] arr = new String[5];
        arr[0]= "8(888)888-88-80";
        arr[1]= "8(888)888-88-81";
        arr[2]= "8(888)888-88-82";
        arr[3]= "8(888)888-88-83";
        arr[4]= "8(888)888-88-84";
        Phone phone0 = new Phone("8(888)888-88-88","Nokia3310",113); // вызов конструктора с 3-мя переменными
        Phone phone1 = new Phone("8(888)888-88-81","Nokia3310"); //вызов конструктора без переменной веса
        Phone phone2 = new Phone();   //вызов пустого конструктора
        System.out.println(phone0.toString());
        System.out.println(phone0.getNumber());
        phone0.receiveCall("Иван");
        phone0.receiveCall2("Иван","8(888)888-88-88");
        phone0.sendMessage(arr);
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
    }
}
