import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    public static void main(String[] args) {
        // Upper Bounded Wildcard
        List<? extends Number> upperBoundedList = new ArrayList<>();
        upperBoundedList = new ArrayList<Integer>();
        upperBoundedList = new ArrayList<Double>();
        // You can read from the upperBoundedList, but can't add to it

        // Lower Bounded Wildcard
        List<? super Integer> lowerBoundedList = new ArrayList<>();
        lowerBoundedList.add(42); // You can add Integer or its supertypes
        lowerBoundedList.add(123);

        // Unbounded Wildcard
        List<?> unboundedList = new ArrayList<>();
        unboundedList = new ArrayList<String>();
        unboundedList = new ArrayList<Integer>();
        // You can read from the unboundedList, but can't add to it
    }
}
