class MyGenericClass<T> {
    private T data;

    public MyGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class GenericExample {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Using the generic class
        MyGenericClass<Integer> integerObj = new MyGenericClass<>(42);
        MyGenericClass<String> stringObj = new MyGenericClass<>("Hello, Java!");

        System.out.println("Integer data: " + integerObj.getData());
        System.out.println("String data: " + stringObj.getData());

        // Using the generic method
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "apple", "banana", "cherry" };

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(strArray);
    }
}
class MyGenericClass<T> {
    private T data;

    public MyGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class GenericExample {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Using the generic class
        MyGenericClass<Integer> integerObj = new MyGenericClass<>(42);
        MyGenericClass<String> stringObj = new MyGenericClass<>("Hello, Java!");

        System.out.println("Integer data: " + integerObj.getData());
        System.out.println("String data: " + stringObj.getData());

        // Using the generic method
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "apple", "banana", "cherry" };

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(strArray);
    }
}
