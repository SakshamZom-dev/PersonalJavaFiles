public class Overloading {
    public static void main(String[] args) {
        // This will call the 'int' version of fun
        fun(67);
        
        // This will call the 'String' version of fun
        fun("Zom King");
    }

    // First version of fun - accepts an integer
    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    // Second version of fun - accepts a String
    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}