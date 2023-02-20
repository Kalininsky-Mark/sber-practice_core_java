package ru.sber.OOP1;

public class PizzaOrder {
    enum Size{
        SMALL,
        MEDIUM,
        BIG,
    }
    private String name;
    private  Size size;
    private boolean needSauce;
    private String address;
    private  boolean isAd;

    PizzaOrder(String n, String s,boolean need, String a){
        name = n;
        size = PizzaOrder.Size.valueOf(s);
        needSauce = need;
        address = a;
    }
    public void order(){
        String sizze="";
        switch (size){
            case SMALL : sizze="���������"; break;
            case MEDIUM : sizze="�������"; break;
            case BIG : sizze="�������"; break;
        }

        if(! isAd){
            if (needSauce){
                System.out.println("����� ������."+sizze+" �����" + '"' + name +'"'
                        + "� ������ �� �����"+address);
                isAd = true;
            }else {
                System.out.println("����� ������. " + sizze + " �����" + '"' + name + '"'
                        + " ��� ����� �� ����� " + address);
            }
        }else{
            System.out.println("����� ��� ������.");
        }
    }
    public void cancel(){
        System.out.println("����� �������");
        isAd = false;
    }

    public  void setName(String n){
        this.name = n;
    }
    public void setNeedSauce(boolean need){
        this.needSauce = need;
    }
    public void setAddress(String a){
        this.address = a;
    }
    public void setSize(String s){
        this.size = PizzaOrder.Size.valueOf(s);
    }
    public String getName() {
        return name;
    }
    public Size getSize() {
        return size;
    }
    public String getAddress() {
        return address;
    }
    public boolean getNeedSauce(){
        return needSauce;
    }

    public String toString() {
        return "PizzaOrder{" + "name='" + name + '\'' + ", size=" + size + ", needSauce="
                + needSauce + ", address='" + address + '\'' + ", isAd=" + isAd + '}';
    }
}
