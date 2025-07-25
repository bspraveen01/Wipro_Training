package Day4;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;

// Class representing a Property with address, price, and number of bedrooms
class Property {
    private String address;
    private double price;
    private int bedrooms;

    // Constructor to initialize a property
    public Property(String addr, double price, int beds) {
        this.address = addr;
        this.price = price;
        this.bedrooms = beds;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for number of bedrooms
    public int getBedrooms() {
        return bedrooms;
    }

    // Overriding toString() to print property details
    @Override
    public String toString() {
        return String.format("Property[address='%s', price=%.2f, bedrooms=%d]",
                             address, price, bedrooms);
    }
}

// Main class
public class LambdaExpression {

    // Static list to store all properties
    static List<Property> properties = new ArrayList<>();

    public static void main(String[] args) {

        // Adding Property objects to the list
        properties.add(new Property("123 Main St", 250_000, 3));
        properties.add(new Property("456 Oak Ave", 150_000, 2));
        properties.add(new Property("789 Pine Rd", 500_000, 4));
        properties.add(new Property("321 Cedar Ln", 200_000, 3));

        // 1. Filtering and printing properties under $300,000
        filterAndAct(
            p -> p.getPrice() < 300_000,                    // Predicate (condition)
            p -> System.out.println("Affordable: " + p)     // Consumer (action)
        );

        System.out.println(); // Just a separator line

        // 2. Filtering and printing properties with exactly 3 bedrooms
        filterAndAct(
            p -> p.getBedrooms() == 3,                      // Predicate (condition)
            p -> System.out.println("Schedule showing: " + p) // Consumer (action)
        );
    }

    // Generic method to filter and perform an action on each property
    static void filterAndAct(Predicate<Property> tester, Consumer<Property> action) {
        for (Property p : properties) {
            if (tester.test(p)) {      // If the condition is true
                action.accept(p);      // Perform the action
            }
        }
    }
}
