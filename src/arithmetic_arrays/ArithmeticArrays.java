package arithmetic_arrays;

public class ArithmeticArrays {
    public static void main(String[] args) {

        // Assignment
        int x1 = 50;
        int x2 = 100;
        int x3 = x1;
        x1 = 65;

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);

        // Division
        int r1 = x2 / 50;
        System.out.println(r1);
        // Integer division truncates fractional part
        System.out.println(100 / 65);
        // Cast int to double, then divide; auto-cast 65 to double
        System.out.println((double) 100 / 65);

        // Addition
        System.out.println(x1 + 1);
        // Subtraction
        System.out.println(x1 - 1);
        // Multiplication
        System.out.println(x1 * 7);

        // Assignment
        System.out.println(x1 = 1);

        // Increment
        int age = 21;
        age++;
        System.out.println(age++);
        System.out.println(age);

        // Decrement
        ++age;
        System.out.println(age);
        System.out.println(++age);
        System.out.println(age);

        // Compound assignment
        age += 5;
        System.out.println(age);
        System.out.println(age += 5);

        // Modulus (actually remainder)
        System.out.println(26 / 7);
        System.out.println(26 % 7);

        boolean b = false;
        char c = 'g';

        // Arrays
        int[] a = {0, 1, 2, 3, 4}; // FIXED type and size
        System.out.println(a[0]);
        System.out.println(a[a.length - 1]);
        a[3] = 100;
        System.out.println(a[3]);
    }
}
