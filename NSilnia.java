package rozmowa;

import java.util.Scanner;

public class NSilnia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba;
        int ile;
        ile = sc.nextInt();
        for (int y = 0; y < ile; y++) {


            liczba = sc.nextInt();

            switch (liczba) {
                case 0:
                    System.out.println("0 1");
                    break;
                case 1:
                    System.out.println("0 1");
                    break;
                case 2:
                    System.out.println("0 2");
                    break;
                case 3:
                    System.out.println("0 6");
                    break;
                case 4:
                    System.out.println("2 4");
                    break;
                case 5:
                    System.out.println("2 0");
                    break;
                case 6:
                    System.out.println("2 0");
                    break;
                case 7:
                    System.out.println("4 0");
                    break;
                case 8:
                    System.out.println("2 0");
                    break;
                case 9:
                    System.out.println("8 0");
                    break;
            }
            if (liczba > 9) {
                System.out.println("0 0");
            }
        }
    }
}