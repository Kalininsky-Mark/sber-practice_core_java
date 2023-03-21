package collections2;

public class TestArray<E> {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.get(0));
        arrayList.add(0,1);
        System.out.println(arrayList.get(0));
        List arr =  arrayList.subList(1,2);
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.indexOf(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.lastIndexOf(2));
        System.out.println(arrayList.contains(1));
        arrayList.remove(1);
        System.out.println(arrayList.removeAt(1));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.contains(1));
        arrayList.clear();
        System.out.println(arrayList.isEmpty());
    }
}
