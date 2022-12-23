public class Main {
    public static void main(String[] args) {
// ----------------------------------------- //
        //      {type} varName = value;
        int x = 5;
        int z = x + 2;
        int y;
        y = 25;
//        System.out.println("z = " + z);
        x = -3;
        z = 2 * x;
//        System.out.println("z = " + z);
        /*
        some code here
         */
        y = 12;
//        System.out.println(x + y);
// ----------------------------------------- //
        short s = 1;
        byte b = 1;
        long l = 1;
        double d = 3.2;
        float f = 2.3f;

        y = 10;
        x = 3;
        z = y - x;
        System.out.println("y - x = " + z);
        z = y / x;
        System.out.println("y / x = " + z);
        z = y % x;
        System.out.println("y % x = " + z);
        z = x + y + y/x + x*(y - 2) + x%y;
        System.out.println("z = " + z);
        z = 2*z;

        int a;
        a = 5;
        int k = a;
        System.out.println(x + ", " + y);
    }
}