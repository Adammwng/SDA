package loop;

public class Exercise2 {
    //Podaj sumę wszystkich liczb z przedziału 1 - 459 (skorzystaj z pętli for).
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 460; i++) {
            sum += i;
        }
        System.out.println(sum);

        int y = 5;
        for (int i = 0; i<=y; i++){
            System.out.println("*");
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
        }
    }
}
