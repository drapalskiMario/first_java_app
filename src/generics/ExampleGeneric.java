package generics;

public class ExampleGeneric<T> {

    private T data;

    public ExampleGeneric(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }
}
