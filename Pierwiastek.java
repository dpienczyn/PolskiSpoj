package rozmowa;

import java.util.Scanner;

public class Pierwiastek {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ile = s.nextInt();
        for (int i = 0; i < ile; i++) {
            double liczba = s.nextInt();
            double sum = Math.sqrt(liczba);
            int r = (int) sum;
            if (sum > 0 && sum == r) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }
}