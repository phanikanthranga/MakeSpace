
import java.util.HashSet;

public class DuplicateStrings {
    public static void main(String[] args) {
        String[] array = {"phanikanth", "ranga", "john", "mary", "smith", "phanikanth", "john", "lucy", "phanikanth"};

        findDuplicates(array);
    }

    public static void findDuplicates(String[] array) {
        // Create HashSet to store unique elements
        HashSet<String> uniqueElements = new HashSet<>();
        HashSet<String> duplicateElements = new HashSet<>();

        System.out.println("The duplicate elements are:");

        for (String element : array) {
            // If the element is already in the HashSet, it's a duplicate
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }

        // Print duplicates
        if (!duplicateElements.isEmpty()) {
            for (String duplicate : duplicateElements) {
                System.out.println(duplicate);
            }
        } else {
            System.out.println("No duplicates were found.");
        }
    }
}
