public class DataTypes {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2_000_000_000;
        long l = 2_000_000_000_000_000_000L;
        System.out.println(b + " " + s + " " + i + " " + l);
        //
        float f = 0.6f;
        double d = 0.14;
        System.out.printf("%.20f\n", 1 / 3.);
        System.out.printf("%.20f\n", 1 / 3f);
        System.out.printf("%d %.5f %c\n", 12, 0.1, 'a');
    }
}
