package rozmowa;

import java.io.IOException;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String znak;
        String liczba;
        String l2;
        int suma = 0;

        while (s.hasNext()) {

            znak = s.next();
            char c = znak.charAt(0);
            liczba = s.next();
            l2 = s.next();
            int l = Integer.parseInt(liczba);
            int u = Integer.parseInt(l2);

            if (c == '+') {
                suma = l + u;
                System.out.println(suma + "\n");
            } else if (c == '-') {
                suma = l - u;
                System.out.println(suma + "\n");
            } else if (c == '*') {
                suma = l * u;
                System.out.println(suma + "\n");
            } else if (c == '/') {
                suma = l / u;
                System.out.println(suma + "\n");
            } else if (c == '%') {
                suma = l % u;
                System.out.println(suma + "\n");
            }

        }
    }
}
