package Day8;


import java.util.*;  // ✅ This import is important

class Comparable_Ex implements Comparable<Comparable_Ex> {

    private String name;
    private int age;

    public Comparable_Ex(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Comparable_Ex other) {
        return this.age - other.age;  // Sorting based on age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Comparable_Ex> a = Arrays.asList(
            new Comparable_Ex("Praveen", 24),
            new Comparable_Ex("Sriram", 22)
        );

        Collections.sortList(a); 
        System.out.println(a);
    }
}


