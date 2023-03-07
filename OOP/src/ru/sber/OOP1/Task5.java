package ru.sber.OOP1;

public class Task5 {
    public static void main(String[] args){
        PizzaOrder pizzaOrder = new PizzaOrder("���-�������","BIG",true,"����������� 101.");
        System.out.println(pizzaOrder.toString());
        pizzaOrder.order();
        pizzaOrder.order();
        pizzaOrder.setAddress("����������� 666.");
        pizzaOrder.setName("��������");
        pizzaOrder.setSize("SMALL");
        pizzaOrder.setNeedSauce(false);
        System.out.println(pizzaOrder.getAddress());
        System.out.println(pizzaOrder.getName());
        System.out.println(pizzaOrder.getSize());
        System.out.println(pizzaOrder.getNeedSauce());
        pizzaOrder.cancel();

    }
}
