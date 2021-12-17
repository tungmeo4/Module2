package Bai10.TrienKhaiList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println("element 4: "+ myList.get(3));
        System.out.println("element 1: "+ myList.get(0));
        System.out.println("element 2: "+ myList.get(1));

        myList.get(6);
        System.out.println("element 6: "+ myList.get(5));
    }


}
