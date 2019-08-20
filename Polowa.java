package rozmowa;

import java.util.Scanner;

public class Polowa {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ile = s.nextInt();
        String zdanie;
        for (int i = 0; i <= ile; i++) {
            zdanie = s.nextLine();
            int z = zdanie.length();
            int y = z / 2;
            zdanie = zdanie.substring(0, y);
            System.out.println(zdanie);
        }
    }
}
