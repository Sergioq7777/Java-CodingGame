import java.util.Scanner;

public class NumMayor {
    public static void numMayor() {

        int Arr[] = new  int[12];
        int mayor = Arr[0];
        int menor = Arr[0];

        int cont = 0;

        System.out.println("Type random numbers: ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = input.nextInt();
            ++cont;
            System.out.println(cont + ". (" + Arr[i] +")");
            if (Arr[i]>mayor){
                mayor = Arr[i];
            }
        }

        System.out.println("El mayor es: " + mayor);
        //System.out.println("El mayor es: " + menor);

    }
}
