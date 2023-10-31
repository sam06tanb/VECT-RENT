import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        String[] emails = new String[n];
        int[] rooms = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Rent #" + (i+1) + ": ");
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Email: ");
            emails[i] = sc.next();
            System.out.print("Room: ");
            rooms[i] = sc.nextInt();
        }


        System.out.println("Busy rooms: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d: %s, %s%n", rooms[i], names[i], emails[i]);
        }


        sc.close();

        }
    }
