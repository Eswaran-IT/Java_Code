import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
		System.out.println("Hello Doods!!!");
		
		  //scanner to get input
		
		Scanner scanner = new Scanner(System.in);
		
		  // Get input for each primitive data type
		
        System.out.print("Enter a byte: ");
        byte userByte = scanner.nextByte();

        System.out.print("Enter a short: ");
        short userShort = scanner.nextShort();

        System.out.print("Enter an int: ");
        int userInt = scanner.nextInt();

        System.out.print("Enter a long: ");
        long userLong = scanner.nextLong();

        System.out.print("Enter a float: ");
        float userFloat = scanner.nextFloat();

        System.out.print("Enter a double: ");
        double userDouble = scanner.nextDouble();

        System.out.print("Enter a char: ");
        char userChar = scanner.next().charAt(0); // Read the first character

        System.out.print("Enter a boolean (true or false): ");
        boolean userBoolean = scanner.nextBoolean();

        // display outputs
        System.out.println("You entered:");
        System.out.println("Byte: " + userByte);
        System.out.println("Short: " + userShort);
        System.out.println("Int: " + userInt);
        System.out.println("Long: " + userLong);
        System.out.println("Float: " + userFloat);
        System.out.println("Double: " + userDouble);
        System.out.println("Char: " + userChar);
        System.out.println("Boolean: " + userBoolean);

        // Close the scanner 
        scanner.close();
        
        
	}
}
