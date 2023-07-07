package generics;

public class ExampleGenericEntry {

    public static void main(String[] args)  {
        var entryString = new ExampleGeneric<String>("Testing");
        System.out.println(entryString.getData());

        var entryLong = new ExampleGeneric<Long>(Long.valueOf(12345));
        System.out.println(entryLong.getData());
    }
}