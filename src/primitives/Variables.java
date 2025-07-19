package primitives;

public class Variables {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
        int j;
        j = 2;
        System.out.println(j);
        long l = 17;
        l = 2_000_000_000;
        l = 3_000_000_000L;
        double d = 17.3;
        float f = 3.14F;
        System.out.println(l + " " + d + " " + f);

        var x = 10; // int  DON'T USE var! of little benefit
        System.out.println(x);

        // int, long (mainly used)
        // double (mainly used)
    }
}
