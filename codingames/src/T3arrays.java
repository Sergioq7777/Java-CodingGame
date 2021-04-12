import java.util.Scanner;

public class T3arrays {
    public static void t3arrays() {
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];

        System.out.println("Type 20 random numbers: ");

        Scanner inputab = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = inputab.nextInt();
            System.out.println(i+") " + a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = inputab.nextInt();
            System.out.println(i+") " + b[i]);
        }
        System.out.println("\n");
// i its going to iterate the array a and b, and j its going to set the numbers in the array a and b in c.
        int j = 0;
        for (int i = 0; i < 5; i++) {
            c[j] = a[i];
            System.out.println(i+") "+"["+c[j] +"]" );
            j++;
            c[j] = b[i];
            System.out.println(i+") "+"["+c[j] +"]" );
            j++;
        }

    }
}
