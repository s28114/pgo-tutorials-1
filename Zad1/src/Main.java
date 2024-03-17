import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");

        int x = scanner.nextInt();

        if (x>0) System.out.println("x jest wieksze od zera");
        if (x==0) System.out.println("x jest rowne zero");
        if (x<0) System.out.println("x jest mniejsze od zera");


    }
}
