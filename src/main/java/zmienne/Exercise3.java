package zmienne;

import java.util.Scanner;

public class Exercise3 {
    //Sprawdź, czy wartość zmiennej jest większa, mniejsza, czy równa zero
    // jak obsłużyć więcej niż dwa przypadki w instrukcji warunkowej).
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("Podana liczba jest większa od zera");
        } else if (x < 0) {
            System.out.println(" Podana liczba jest mniejsza od zera");
        } else
            System.out.println("Podana liczba jest równa zero");
    }
}