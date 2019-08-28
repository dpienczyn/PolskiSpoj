package rozmowa;

import java.util.Scanner;

public class Podzielnoœæ {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ile = s.nextInt();
        for (int o = 0; o < ile; o++) {
            int g = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            for (int i = 0; i < g; i++) {
            	
                if (i % x == 0 && i % y != 0)
                    System.out.print(i + " ");
            }
        }
    }
}
