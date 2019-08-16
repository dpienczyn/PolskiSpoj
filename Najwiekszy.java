package rozmowa;

import java.util.Scanner;

public class Najwiekszy {

    public int liczba(int liczba, int liczba1) {
        while (liczba != liczba1) {
            if (liczba > liczba1) {
                liczba -= liczba1;
            } else {
                liczba1 -= liczba;
            }
        }
        return liczba;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Najwiekszy n = new Najwiekszy();
        int ile = s.nextInt();
        for (int i = 0; i < ile; i++) {
            int liczba = s.nextInt();
            int liczba1 = s.nextInt();
            int y = n.liczba(liczba, liczba1);
            System.out.println(y);
        }
    }
}
