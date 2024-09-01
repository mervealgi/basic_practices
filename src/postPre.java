public class postPre {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x;                   // y: 6
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        int a = 5;
        int b = a++;                   // b: 5
        System.out.println("a: " + a);
        System.out.println("b: " + b);


        int c = 7;
        System.out.println(c--);       // c: 7
        int d = 1;
        System.out.println(--d);       // c: 0


        int e = 10;
        int f = 5;
        int result;
        result = ++e * f;              // e: 11 * 5
        System.out.println("Prefix - e: " + e + ", f: " + f + ", result: " + result);

        int g = 10;
        int result2 = g++ * f;         // g: 10 * 5
        System.out.println("Postfix - g: " + g + ", f: " + f + ", result: " + result2);
    }
}
