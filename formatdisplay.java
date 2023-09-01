public class formatdisplay{
    public static void main(String[] args) {
        int value = 5;

        // Using printf with format options
        // %d is used to format integers
        System.out.printf("%d%n", value);

        // Minimum width of 3 digits
        System.out.printf("%03d%n", value);

        // Minimum width of 3 characters (left-justified)
        System.out.printf("%-3d%n", value);

        // %% is used to print a single %
        System.out.printf("%d%%%n", value);
    }
}
