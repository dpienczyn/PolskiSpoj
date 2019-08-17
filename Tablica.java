import java.util.Scanner;

public class Tablica {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ile = s.nextInt();
        for (int y = 0; y <= ile; y++) {
            String tab[] = s.nextLine().split(" ");
            for (int i = tab.length - 1; i > 0; i--) {
                System.out.print(tab[i] + " ");
            }
        }
    }
}