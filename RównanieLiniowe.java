package rozmowa;
import java.util.Locale;
import java.util.Scanner;

public class RównanieLiniowe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double sum = (c - b) / a;

        if (a != 0 && b != 0 && c != 0) {
            System.out.format(Locale.US, "%.2f%n", sum);
        }
        if (a == b - c) {
            System.out.println("NWR");
        }
        if (a == 0 && b - c != 0)
            System.out.print("BR");
    }
}