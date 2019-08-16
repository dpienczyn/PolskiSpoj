package rozmowa;

import java.util.Scanner;

public class NWD {

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

    public int NWW(int liczba, int liczba1) {
        int nww = liczba * liczba1;
        return nww;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int ile = s.nextInt();
        NWD n = new NWD();
        for (int i = 0; i < ile; i++) {
            int liczba = s.nextInt();
            int liczba1 = s.nextInt();
            int y = n.liczba(liczba, liczba1);
            int nww = n.NWW(liczba, liczba1);
            int sum = nww / y;
            System.out.println(sum);
        }
    }
}