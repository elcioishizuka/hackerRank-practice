package thirtyDaysOfCode.day12.Inheritance1;


// Subclass
class MySubclass extends MySuperclass {
    // Subclass' constructor:
    MySubclass(String myString) {
        // Explicit call to superclass' constructor:
        super(myString);
    }

    public static void main(String[] args) {
        MySuperclass s1 = new MySubclass("Hello, World!");
        System.out.println(s1.myString);

        MySubclass s2 = new MySubclass("Hello, World.");
        System.out.println(s2.myString);
    }
}
