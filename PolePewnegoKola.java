import java.util.Locale;
import java.util.Scanner;

public class PolePewnegoKola {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double s2;
        double r = s.nextInt();
        double d = s.nextInt();
        double r2 = (r * r) - ((d * d) / 4);
        s2 = Math.PI * r2;
        if (s2 >= 0.01) {
            System.out.println(s2);
        }
    }
}
