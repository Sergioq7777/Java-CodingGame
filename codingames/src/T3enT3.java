import java.util.Scanner;

public class T3enT3 {
    public static void t3ent3()
    {
        int[] A = new int[4];
        int[] B = new int[4];
        int[] C = new int[8];
        System.out.println("input 8 random numbers");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
            System.out.println(i+".A) " + A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = input.nextInt();
            System.out.println(i+".B) " + B[i]);
        }


        System.out.println("\n");

        for (int i = 0; i < A.length; i++)System.out.print(A[i]);

        System.out.println("\n");

        for (int i = 0; i < B.length; i++)System.out.print(B[i]);

        System.out.println("\n");



        int j = 0, k = 0;
        while (j<12){
            for (int i = 0; i < 2; i++) {
                C[k] = A[j+i];
                System.out.println(j+".A) " + C[k]);
                k++;
            }

            for (int i = 0; i < 2; i++) {
                C[k] = B[j+i];
                System.out.println(j+".B) " + C[k]);
                k++;
            }

            j=+2;
        }




    }
}
