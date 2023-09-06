public class GenericClassExample<T> {

    private T data;

    public GenericClassExample(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    // Static generic method
    public static <U> void staticMethod(U value) {
        System.out.println("Static method called with value: " + value);
    }

    public static void main(String[] args) {
        // Creating an instance of the generic class with Integer type
        GenericClassExample<Integer> integerInstance = new GenericClassExample<>(42);
        System.out.println("Data from integerInstance: " + integerInstance.getData());

        // Creating an instance of the generic class with String type
        GenericClassExample<String> stringInstance = new GenericClassExample<>("Hello, World!");
        System.out.println("Data from stringInstance: " + stringInstance.getData());

        // Calling the static generic method with different types
        staticMethod(123);
        staticMethod("Static Method");
    }
}
