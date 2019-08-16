package rozmowa;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        while (s.hasNext()) {
            int liczba = s.nextInt();
            suma += liczba;
            System.out.print(suma + "\n");
        }
    }
}
