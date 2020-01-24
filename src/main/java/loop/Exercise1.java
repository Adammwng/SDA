package loop;

public class Exercise1 {
    //Wypisz wszystkie liczby z zakresu 5 - 100.
    //Wypisz wszystkie liczby z zakresu 55 - 150.
    //Wypisz wszystkie liczby z zakresu 1 - 100 zaczynając od 100.
    //Wypisz wszystkie liczby parzyste z przedziału 0 - 100.
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        for (int i = 5; i<101; i++){
            System.out.println(i);
        }
        System.out.println("Exercise 2");
        for (int i = 55; i<=150; ++i){
            System.out.println(i);
        }
        System.out.println("Exercise 3");
        for (int i = 100; i>0; i--){
            System.out.println(i);
        }
        System.out.println("Exercise 4");
        for (int i =0; i<101; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
