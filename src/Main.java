import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę silni");
        int y = 1;
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();

        for(int i=1; i<=x; i++) {
            y = y * i;
        }
            System.out.println("Silnia z liczby " + x +" wynosi " + y);


    }
}