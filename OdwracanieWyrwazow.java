package rozmowa;

import java.util.Scanner;

public class OdwracanieWyrwazow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String slowo;
		while(s.hasNext()) {
			slowo = s.next();
			StringBuilder r = new StringBuilder(slowo);
			r.reverse();
			System.out.println(r+"\n");
		}
	}
}
