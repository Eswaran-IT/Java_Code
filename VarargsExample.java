public class VarargsExample {

    // Varargs ellipsis ...
    public void printArray(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    // Varargs using Object 
    public void printObjects(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    // Varargs for type-specific integers
    public void printIntegers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();

        // Calling the methods with varargs
        System.out.println("Printing Strings:");
        example.printArray("Hello", "World");

        System.out.println("\nPrinting Objects:");
        example.printObjects("Hello", 42, true);

        System.out.println("\nPrinting Integers:");
        example.printIntegers(1, 2, 3);
    }
}
