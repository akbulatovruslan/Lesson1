import java.util.Scanner;

public class Methods {

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else  {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int res = max(a, b);
        System.out.println(res);
    }
}
