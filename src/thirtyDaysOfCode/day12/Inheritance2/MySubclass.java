package thirtyDaysOfCode.day12.Inheritance2;

import thirtyDaysOfCode.day12.Solution;

// Subclass
class MySubclass extends MySuperclass {
    MySubclass(String myString) {
        // A behind-the-scenes implicit call to the
        // superclass' default constructor happens

        // Subclass can now initialize superclass instance variable:
        this.myString = myString;
    }

    public static void main(String[] args) {
        MySuperclass s1 = new MySubclass("Hello, World!");
        System.out.println(s1.myString);

        MySubclass s2 = new MySubclass("Hello, World.");
        System.out.println(s2.myString);
    }

}
