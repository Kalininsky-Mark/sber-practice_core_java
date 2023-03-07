package ru.sber.OOP1;



public class Phone{
    private String number;
    private String model;
    private int weight;

    public String getNumber() {
        return number;
    }
    public void receiveCall(String name){
        String out;
        out = "Звонит "+ name;
        System.out.println(out);
    }
    Phone(String n, String m, int w){   //конструктор Phone
        number = n;
        model = m;
        weight = w;
    }
    Phone(String n, String m){  //конструктор для двух переменных
        number = n;
        model = m;
    }
    Phone(){  //пустой конструктор
    }
    public void sendMessage(String[] numbers){
        for (String s : numbers) {
            System.out.println(s);
        }
    }

    public String toString() {
        return "Phone{" + "number='" + number + '\'' + ", model='" + model + '\'' + ", weight=" + weight + '}';
    }

    public void receiveCall2(String name, String n) {
        String out;
        out = "Звонит "+ name + " " + n;
        System.out.println(out);

    }
}
