public class logicalComparison {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 11;
        System.out.println("Result1 : " + (n1 == n2));
        System.out.println("Result1 : " + (n1 < n2));
        System.out.println("Result1 : " + (n1 > n2));
        System.out.println("Result1 : " + (n1 <= n2));
        System.out.println("Result1 : " + (n1 >= n2));
        System.out.println("Result1 : " + (n1 != n2));

        //
        boolean v1 = true;
        boolean v2 = false;
        System.out.println("value1 and value2: " + (v1 && v2));
        System.out.println("value1 and value2: " + (v1 || v2));
    }
}
