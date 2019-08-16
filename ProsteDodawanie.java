package rozmowa;

import java.util.Scanner;

public class ProsteDodawanie {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ile = s.nextInt();

        int tab[] = new int[100];
        for (int y = 0; y < ile; y++) {
            int w = 0;
            int ilosc = s.nextInt();
            for (int i = 0; i < ilosc; ++i) {
                int liczba = s.nextInt();

                w = w + liczba;
                tab[i] = w;
            }
            System.out.println(w);
        }
    }
}

