package javaexample.myiterator;

public class MyTest {
    public static void main(String[] args) {
        MyList<String> mylist = new MyList<>();

        mylist.add("bhawani");
        mylist.add("bugi");

        for(String st: mylist) {
            System.out.println(st);
        }

        mylist.forEach(System.out::println);
    }
}
