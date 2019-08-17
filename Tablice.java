import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String tab[] = s.nextLine().split(" ");
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
    }
}