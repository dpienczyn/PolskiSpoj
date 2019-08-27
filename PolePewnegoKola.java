import java.util.Locale;
import java.util.Scanner;

public class PolePewnegoKola {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double s2;
        double PI = 3.141592654;
        double r = s.nextDouble();
        double d = s.nextDouble();
        double r2 = -1 * ((d / 2) * (d / 2) - r * r);
        s2 = PI * r2;
        System.out.println(s2);
    }
}