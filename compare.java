
public class compare {

	
	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "Hello";
	        String str3 = new String("Hello");

	        // Compare using equals (checks value only)
	        boolean result1 = str1.equals(str2);
	        boolean result2 = str1.equals(str3);
	        System.out.println("result1: " + result1 + ", result2: " + result2);

	        // Compare using == (checks value and memory address)
	        boolean result3 = str1 == str2;
	        boolean result4 = str1 == str3;
	        System.out.println("result3: " + result3 + ", result4: " + result4);
	    }
	}



