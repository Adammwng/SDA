package zmienne;

import java.util.Scanner;

public class Exercise2 {
    //Sprawdź, czy wartość przypisana zmiennej jest parzysta,
    // czy nie (wypisz na ekranie odpowiedni komunikat).

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x%2 == 0){
            System.out.println("Podana liczba jest parzysta");
        }else
            System.out.println("Podana liczba jest nieparzysta");
    }
}
