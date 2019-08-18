package rozmowa;

import java.util.Scanner;

public class Samolot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int k1 = s.nextInt();
        int n2 = s.nextInt();
        int k2 = s.nextInt();
        int m1 = n1 * k1;
        int m2 = n2 * k2;
        int sum = m1 + m2;
        System.out.print(sum);
    }
}