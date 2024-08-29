public class variables {
    public static void main(String[] args) {

        // int 1value = 1;  //1value is not possible for a variable

        int a = 4;
        System.out.println(a);

        int b = 10;
        double c = 3.0;
        int d = (int)(b/c);
        double e = b % c;
        System.out.println("d:" + d);
        System.out.println("e:" + e);


        int f = 5;
        int g = ++f;
        int h = f++;
        int i = --g;
        System.out.println("f:" + f);
        System.out.println("g:" + g);
        System.out.println("h:" + h);
        System.out.println("i:" + i);

        //byte --> short --> int --> long
        //int --> float --> double
        double x = 4d;
        float j = (float)5.0; //for conversation to double without () can not be accepted
        float k = 5f;
        float l = 5.2f;

        int pi1 = 22 / 7;
        float pi2 = 22f / 7f;
        double pi3 = 22d / 7d;
        System.out.println(pi1 + ' ' + pi2 + ' ' + pi3);

    }
}
