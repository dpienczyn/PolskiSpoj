package rozmowa;

import java.util.Scanner;

public class NowaDzialka {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ile = s.nextInt();
		
		for(int i=0; i<ile; i++) {
			int liczba = s.nextInt();
			int suma = liczba*liczba;
			System.out.println(suma);
		}
	}
}
