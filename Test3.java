package rozmowa;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        int liczba;
        int poprzednia = 42;
        while (s.hasNext()) {
            liczba = s.nextInt();
            System.out.println(liczba);
            if (liczba == 42 && poprzednia != 42) {
                wynik += 1;
                if (wynik == 3) {
                    System.exit(0);
                }
            }
            poprzednia = liczba;
        }
    }
}