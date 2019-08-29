package rozmowa;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class RównanieKwadratowe {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        while (s.hasNext()) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta > 0) {
                System.out.println("2");
            }
            if (delta < 0) {
                System.out.println("0");
            }
            if (delta == 0) {
                System.out.println("1");
            }
        }
    }
}
