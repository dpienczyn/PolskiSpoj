package rozmowa;

import java.util.Scanner;

public class SystemyPozycyjne {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ile = s.nextInt();
        for (int i = 0; i < ile; i++) {
            int z = s.nextInt();
            String dec = Integer.toHexString(z);
            String j = Integer.toString(z, 11);  //system jednastkowy
            System.out.println(dec.toUpperCase() + " " + j.toUpperCase());
        }
    }

}
